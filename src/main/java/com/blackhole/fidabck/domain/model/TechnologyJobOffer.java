package com.blackhole.fidabck.domain.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@ToString
@Entity
@Table(name = "TECHNOLOGY_JOB_OFFER")
public class TechnologyJobOffer {

    @EmbeddedId
    private TechnologyJobOfferPK id;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;

}
