package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

public class TechnologieJobOffer extends TrackingData{

    private TechnologieJobOfferPK id;

    public TechnologieJobOffer(Timestamp createDate, String createBy) {
        super(createDate, createBy);
    }
}
