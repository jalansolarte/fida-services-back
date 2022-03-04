package com.blackhole.fidabck.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Builder
@ToString
@Entity
@Table(name = "step")
public class Step {

    private Integer idStepType;
    private Integer IdCandidateOfferProcess;

    private String feedback;
    @Column(name = "is_aproved")
    private Boolean isAproved;
    private Boolean status;


    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;
}
