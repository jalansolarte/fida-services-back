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
public class AuditUser {

    private Integer idAuditUser;
    private Integer user;
    private String comment;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp updatedDate;
    private String updatedBy;
}
