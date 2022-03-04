package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

//"JOB_OFFER_STATUS
public class JobOfferStatus extends TrackingData{

    private Long idJobOfferStatus;
    private String name;

    public JobOfferStatus(Timestamp createDate, String createBy) {
        super(createDate, createBy);
    }
}
