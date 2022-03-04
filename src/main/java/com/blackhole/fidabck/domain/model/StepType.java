package com.blackhole.fidabck.domain.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Builder
@ToString
@Entity
@Table(name = "step")
public class StepType {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_step_type")
    private Integer idStepType;
    private String name;
    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;
}
