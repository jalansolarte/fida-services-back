package com.blackhole.fidabck.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TechnologyJobOfferPK {

    @Column(name = "id_job_offer")
    private Long idJobOffer;

    @Column(name = "id_techcnology")
    private Long id_techcnology;
}
