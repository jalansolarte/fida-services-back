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
public class AuditCandidate {

    private Integer idAuditCandidate;
    private Integer idCandidate;
    private String comment;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp updatedDate;
    private String updatedBy;
}
