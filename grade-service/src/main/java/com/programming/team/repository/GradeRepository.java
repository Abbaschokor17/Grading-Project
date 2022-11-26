package com.programming.team.repository;

import com.programming.team.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GradeRepository extends JpaRepository<Grade, Long> {
}
