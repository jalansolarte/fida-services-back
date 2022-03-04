package com.blackhole.fidabck.domain.model;

import lombok.*;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StepType {

    private Integer idStepType;
    private String name;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp updatedDate;
    private String updatedBy;
}
