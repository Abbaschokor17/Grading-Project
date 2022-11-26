package com.programming.team.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GradeResponse {

    private Long Id;
    private String nameOfjury;
    private String numberofgroup;
    private BigDecimal projectobjectivesexpectedoutcomes;
    private BigDecimal citerecentdevelopmentspertainingtoanengineeringfield;
    private BigDecimal requirements;
    private BigDecimal constraints;
    private BigDecimal solutionsprecifications;
    private BigDecimal futureworkplan;
    private BigDecimal oralcommunicationskills;
    private BigDecimal slidesquality;
}
