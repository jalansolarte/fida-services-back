package com.blackhole.fidabck.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StepPK {

    @Column(name = "id_step_type")
    private Integer idStepType;

    @Column(name = "id_candidate_offer_process")
    private Integer IdCandidateOfferProcess;
}
