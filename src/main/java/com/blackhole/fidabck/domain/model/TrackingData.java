package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

public class TrackingData {

    private Timestamp createDate;
    private String createBy;
    private Timestamp updateDate;
    private String updateBy;

    public TrackingData(Timestamp createDate, String createBy) {
        this.createDate = createDate;
        this.createBy = createBy;
    }
}
