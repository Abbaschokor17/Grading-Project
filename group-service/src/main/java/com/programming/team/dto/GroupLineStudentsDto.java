package com.programming.team.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupLineStudentsDto {

    private Long id;
    private String matricule;
    private String fullnamestudent;

}
