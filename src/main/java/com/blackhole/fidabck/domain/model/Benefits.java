package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

//"BENEFITS"
public class Benefits extends TrackingData{

    private Long idBenefit;

    public Benefits(Timestamp createDate, String createBy) {
        super(createDate, createBy);
    }
}
