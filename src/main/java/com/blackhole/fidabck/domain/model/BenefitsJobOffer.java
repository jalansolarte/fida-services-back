package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

//"BENEFITS_JOB_OFFER"
public class BenefitsJobOffer extends TrackingData{

    private BenefitsJobOfferPK id;

    public BenefitsJobOffer(Timestamp createDate, String createBy) {
        super(createDate, createBy);
    }
}
