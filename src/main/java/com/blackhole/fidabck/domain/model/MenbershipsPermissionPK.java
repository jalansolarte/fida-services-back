package com.blackhole.fidabck.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MenbershipsPermissionPK {

    @Column(name = "id_memberships")
    private Long idMemberships;

    @Column(name = "id_permission")
    private Long idPermission;
}
