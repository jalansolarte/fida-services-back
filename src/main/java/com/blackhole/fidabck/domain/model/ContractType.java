package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

public class ContractType extends TrackingData{

    private Long idContractType;
    private String name;


    public ContractType(Timestamp createDate, String createBy, String name) {
        super(createDate, createBy);
        this.name = name;
    }
}
