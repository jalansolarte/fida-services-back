package com.blackhole.fidabck.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USER_APP")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "user_name")
    private String username;

    private String password;

    @Transient
    private String token;
}
