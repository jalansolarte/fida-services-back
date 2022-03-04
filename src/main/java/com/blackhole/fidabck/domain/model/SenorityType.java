package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

//SENORITY_TYPE
public class SenorityType extends TrackingData{

    private Long idSenority;
    private String name;

    public SenorityType(Timestamp createDate, String createBy) {
        super(createDate, createBy);
    }
}
