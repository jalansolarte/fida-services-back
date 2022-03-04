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
public class TechnologyCandidate {

    private Integer idTechnologyCandidate;
    private Integer idCandidate;
    private Integer idTechnology;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp updatedDate;
    private String updatedBy;
}
