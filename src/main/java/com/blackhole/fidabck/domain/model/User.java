package com.blackhole.fidabck.domain.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name = "USUARIO")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "pass")
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "token")
    private String token;
}
