package com.programming.team.repository;

import com.programming.team.model.Check;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CheckRepository extends JpaRepository<Check, Long> {
    Optional<Check> findByMatricule(String matricule);
}
