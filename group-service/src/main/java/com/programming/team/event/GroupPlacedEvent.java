package com.programming.team.event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupPlacedEvent {
    private String GroupUniqueNumber;
}