package com.geon.bis.link.api;

import com.geon.bis.link.mapper.BaseInfoVersionMapper;
import com.geon.bis.link.mapper.model.ParamBaseInfoVersion;
import com.geon.bis.link.mapper.model.ResultBaseInfoVersion;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/data/")
public class monitor {

	final private BaseInfoVersionMapper baseInfoVersionMapper;
	
	@GetMapping(value = "{serviceID}")
	@ResponseBody
	public String putData(@PathVariable("serviceID") String serviceID, @RequestParam Map<String, String> params) {
		log.info("[API][데이터 조회] ServiceID : " + serviceID + ", Params : " + params.toString());
		
		String respString;
		
		try {
			switch(serviceID) {
				case "BaseinfoVersion" :
					respString = BaseinfoVersion(params);
					break;
				default :
					respString = "[API][데이터 조회] 조회오류, 일치하는 서비스가 없습니다.";
					break;
			}
			
			return respString;
        } catch (IOException e) {
        	return "[API][데이터 조회] 조회오류 : " + e.getMessage();
        }
		
	}
	
	public String BaseinfoVersion(Map<String, String> params) throws IOException {
		String respString = null;

		//전체 버전정보인지, 현재 버전정보인지 확인
		switch(params.get("type")) {
			case "current" :
				List<ResultBaseInfoVersion> baseinfoVersionList = baseInfoVersionMapper.getVersions(ParamBaseInfoVersion.builder()
								.mode("SINGLE")
								.origin(List.of(Integer.parseInt(params.get("origin"))))
						.build());
				respString = "[API][데이터 조회][BaseinfoVersion] origin : "+params.get("origin")+", data : " + baseinfoVersionList.toString();
				break;
			case "all" :
				//Map<String, String> baseinfoVersionGroup = ApiMapper.getBaseinfoVersionAll(params.get("origin"));
				//respString = "[API][데이터 조회][BaseinfoVersion] origin : "+params.get("origin")+", data : " + baseinfoVersionGroup.toString();
				break;
			default : 
				respString = "[API][데이터 조회][BaseinfoVersion] 조회오류, 일치하는 type이 없습니다.";
				break;
		}
		
		
		return respString;
	}
}