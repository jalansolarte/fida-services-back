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
@Table(name = "candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_candidate")
    private Integer idCandidate;

    @Column(name = "full_name")
    private String fullName;
    private String email;
    private Integer phone;
    private String cv;

    @Column(name = "id_type")
    private Integer idType;

    @Column(name = "id_senority_type")
    private Integer idSenorityType;

    @Column(name = "work_experience")
    private Integer workExperience;

    @Column(name = "primary_technology")
    private String primaryTechnology;

    @Column(name = "secondary_technology")
    private String secondTechnology;

    @Column(name = "salary_preference")
    private Integer salaryPreference;

    @Column(name = "id_type_contract")
    private Integer idTypeContract;

    @Column(name = "id_work_modality")
    private Integer idWorkModality;

    @Column(name = "number_views")
    private Long numberView;

    @Column(name = "enable_search")
    private Boolean enableSearch;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;
}