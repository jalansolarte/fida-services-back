package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

//"WORK_MODALITY"
public class WorkModality extends TrackingData{

    private Long idWorkModality;
    private String name;

    public WorkModality(Timestamp createDate, String createBy) {
        super(createDate, createBy);
    }
}
