package com.geon.bis.link.api;



import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/put/")
public class input {

	@PutMapping(value = "{serviceID}")
	@ResponseBody
	public String putData(@PathVariable("serviceID") String serviceID, @RequestParam Map<String, String> params, @RequestBody String list) {
		log.info("[API][데이터 입력] ServiceID : " + serviceID + ", Params : " + params.toString() + ", list : " + list);
		
		String respString = "ok!";

        switch(serviceID) {
            case "BaseinfoVersion" :
                break;
            case "BusLocationInfo" :
                break;
            case "ArrivalPredictionTimeInfo" :
                break;
            case "Station" :
                break;
            case "Node" :
                break;
            case "Link" :
                break;
            case "Linkcoords" :
                break;
            case "Route" :
                break;
            case "Routeplan" :
                break;
            case "Routestation" :
                break;
            case "Vehicle" :
                break;
            case "Routelink" :
                break;
            case "Routeallocate" :
                break;
            case "Company" :
                break;
            case "Admin" :
                break;
            case "Baseinfo" :
                break;
            default :
                respString = "[API][데이터 입력] 입력오류, 일치하는 서비스가 없습니다.";
                break;
        }

        return respString;

    }

}