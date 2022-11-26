package com.programming.team.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_groups")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String GroupUniqueNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<GroupLineStudents> groupLineStudentsList;
}
