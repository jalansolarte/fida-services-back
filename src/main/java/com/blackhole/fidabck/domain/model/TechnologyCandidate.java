package com.blackhole.fidabck.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@ToString
@Entity
@Table(name = "TECHNOLOGY_CANDIDATE")
public class TechnologyCandidate {

    @Column(name = "id_technology_candidate")
    private Integer idTechnologyCandidate;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_candidate")
    private Integer idCandidate;
    @Column(name = "id_technology")
    private Integer idTechnology;


    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;
}
