package com.programmingtechie.studentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

    private String fullname;
    private String fathername;
    private String matricule;
    private String email;
}
