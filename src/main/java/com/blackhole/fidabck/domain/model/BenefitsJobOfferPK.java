package com.blackhole.fidabck.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BenefitsJobOfferPK {

    @Column(name = "id_job_offer")
    private Long idJobOffer;

    @Column(name = "id_benefits")
    private Long idBenefit;
}