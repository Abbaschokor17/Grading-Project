package com.programming.team.repository;

import com.programming.team.model.Jury;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface JuryRepository extends MongoRepository<Jury, String> {
}
