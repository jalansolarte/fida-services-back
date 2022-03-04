package com.blackhole.fidabck.domain.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@ToString
@Entity
@Table(name = "USER_APP")
public class UserApp {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "full_name")
    private String fullname;
    private String email;
    @Column(name = "date_of_birth")
    private Timestamp dateOfBirth;
    private Integer phone;

    @Column(name = "user_name")
    private String username;

    private String password;

    @Column(name = "id_type")
    private Long idType;
    @Column(name = "id_role")
    private Long idRole;
    @Column(name = "id_company")
    private Long idCompany;

    @Transient
    private String token;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;
}
