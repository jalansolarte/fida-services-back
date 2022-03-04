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
public class StepProcess {

    private Integer idStepProcess;
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
