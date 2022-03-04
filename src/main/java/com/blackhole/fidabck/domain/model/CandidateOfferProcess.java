package com.blackhole.fidabck.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

/*
@Data
@Builder
@ToString
*/
public class CandidateOfferProcess {

    private Integer idCandidateOfferProcess;
    private Integer idStatus;
    private Integer idJobOffer;
    private Integer idCandidate;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp updatedDate;
    private String updatedBy;
}
