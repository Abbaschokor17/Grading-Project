package com.programming.team.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "t_grades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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