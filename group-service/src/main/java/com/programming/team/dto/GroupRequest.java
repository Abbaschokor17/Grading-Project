package com.programming.team.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class  GroupRequest {
    private String GroupUniqueNumber;
    private List<GroupLineStudentsDto> groupLineStudentsDtoList;
}
