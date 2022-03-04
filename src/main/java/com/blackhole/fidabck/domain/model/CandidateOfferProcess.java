package com.blackhole.fidabck.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Builder
@ToString
@Entity
@Table(name = "candidate_offer_process")
public class CandidateOfferProcess {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_candidate_offer_process")
    private Integer idCandidateOfferProcess;

    @Column(name = "id_status")
    private Integer idStatus;

    @Column(name = "id_job_offer")
    private Integer idJobOffer;

    @Column(name = "id_candidate")
    private Integer idCandidate;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;
}