package com.programmingtechie.studentservice.repository;

import com.programmingtechie.studentservice.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
