package com.blackhole.fidabck.domain.model;

import java.sql.Timestamp;

/*
@Data
@Builder
@ToString
*/
public class Step {

    private Integer idStep;
    private String feedback;
    private Boolean isAproved;
    private Boolean status;
    private Integer idStepType;
    private Integer IdCandidateOfferProcess;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp updatedDate;
    private String updatedBy;
}
