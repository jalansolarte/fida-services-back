package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

//CANDIDATE_OFFER_PROCESS_STATUS
public class CandidateOfferProcessStatus extends TrackingData{

    private Long idProcessStatus;
    private String name;


    public CandidateOfferProcessStatus(Timestamp createDate, String createBy) {
        super(createDate, createBy);
    }
}
