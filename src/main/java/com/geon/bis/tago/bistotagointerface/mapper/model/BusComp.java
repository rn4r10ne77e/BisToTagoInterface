package com.geon.bis.tago.bistotagointerface.mapper.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusComp {
    private String companyId;
    private String companyNm;
    private String phoneNo;
    private String faxNo;
    private String address;
    private String ceoNm;
    private String busCnt;
    private String regCnt;
    private String spareCnt;
}
