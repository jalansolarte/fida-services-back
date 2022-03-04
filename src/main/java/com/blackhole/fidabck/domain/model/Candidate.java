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
public class Candidate {

    private Integer idCandidate;
    private String fullName;
    private String email;
    private Integer phone;
    private String cv;
    private Integer idType;
    private Integer idSenorityType;
    private Integer workExperience;
    private String primaryTechnology;
    private String secondTechnology;
    private Integer salaryPreference;
    private Integer idTypeContract;
    private Integer idWorkModality;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp updatedDate;
    private String updatedBy;
}
