package com.blackhole.fidabck.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PermissionRolePK {

    @Column(name = "id_role")
    private Long idRole;

    @Column(name = "id_permission")
    private Long idPermission;
}
