package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

public class AutidJobOffer extends TrackingData{

    private Long idAutidJobOffer;
    private JobOffer jobOffer;
    private String statusName;
    private String reason;

    public AutidJobOffer(JobOffer jobOffer,String statusName, String reason, Timestamp createDate, String createBy) {
        super(createDate, createBy);
        this.jobOffer = jobOffer;
        this.statusName = statusName;
        this.reason = reason;
    }
}
