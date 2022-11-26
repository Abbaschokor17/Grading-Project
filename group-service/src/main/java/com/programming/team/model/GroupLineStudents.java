package com.programming.team.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "t_group_line_students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupLineStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String fullnamestudent;

}
