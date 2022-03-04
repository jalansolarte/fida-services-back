package com.blackhole.fidabck.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@ToString
@Entity
@Table(name = "job_offer")
public class JobOffer {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_job_offer")
    private Long idJobOffer;

    @Column(name = "name_offer")
    private String nameOffer;

    @Column(name = "salary_offer")
    private Long salaryOffer;

    @Column(name = "id_contract_type")
    private List<ContractType> contractTypeList;

    @Column(name = "id_work_modality")
    private Long idWorkModality;

    @Column(name = "id_user")
    private Long id_user;

    @Column(name = "id_status")
    private Long idStatus;

    @Column(name = "is_bilingual")
    private Boolean isBilingual;

    @Column(name = "id_senority_type")
    private Long idSenorityType;

    @Column(name = "work_experience")
    private Integer workExperience;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;
}