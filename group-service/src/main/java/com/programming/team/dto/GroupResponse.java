package com.programming.team.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupResponse {

    private long id;
    private String GroupUniqueNumber;
    private List<GroupLineStudentsDto> groupLineStudentsDtoList;

}
