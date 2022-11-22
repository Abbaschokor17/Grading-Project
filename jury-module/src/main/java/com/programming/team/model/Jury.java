package com.programming.team.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "jury")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Jury {

    @Id
    private String id;
    private String fullname;
    private String email;
}
