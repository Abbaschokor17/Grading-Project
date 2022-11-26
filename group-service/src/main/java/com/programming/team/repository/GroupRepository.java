package com.programming.team.repository;

import com.programming.team.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupRepository extends JpaRepository<Group, Long> {
}
