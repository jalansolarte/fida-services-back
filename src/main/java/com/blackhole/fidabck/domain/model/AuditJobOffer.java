package com.blackhole.fidabck.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Data @Builder @ToString
@Entity @Table(name = "audit_job_offer")
public class AuditJobOffer {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_auditory_job_offer")
    private Long idAuditJobOffer;

    @Column(name = "id_job_offer")
    private JobOffer idJobOffer;

    @Column(name = "status_name")
    private String statusName;
    private String reason;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;
}
