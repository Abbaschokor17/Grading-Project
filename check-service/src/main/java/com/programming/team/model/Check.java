package com.programming.team.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "t_check")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Check {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String fullnamestudent;
    private Integer present;
}