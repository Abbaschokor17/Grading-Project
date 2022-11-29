package com.programming.team.repository;

import com.programming.team.model.Check;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface CheckRepository extends JpaRepository<Check, Long> {


    List<Check> findByMatriculeIn(List<String> matricule);
}
