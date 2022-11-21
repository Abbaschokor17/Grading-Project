package com.programmingtechie.studentservice.service;

import com.programmingtechie.studentservice.dto.StudentRequest;
import com.programmingtechie.studentservice.dto.StudentResponse;
import com.programmingtechie.studentservice.model.Student;
import com.programmingtechie.studentservice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    private final StudentRepository studentRepository;

    public void createStudent(StudentRequest studentRequest) {
        Student student = Student.builder()
                .fullname(studentRequest.getFullname())
                .fathername(studentRequest.getFathername())
                .matricule(studentRequest.getMatricule())
                .email(studentRequest.getEmail())
                .build();

        studentRepository.save(student);
        log.info("Student {} is saved", student.getId());
    }

    public void deleteStudent(StudentResponse studentResponse){
        Student student = new Student();
         student.setId(studentResponse.getId());
        studentRepository.delete(student);
        log.info("Student {} is deleted",student.getMatricule());
    }

    public List<StudentResponse> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students.stream().map(this::mapToStudentResponse).toList();
    }

    private StudentResponse mapToStudentResponse(Student student) {
        return StudentResponse.builder()
                .id(student.getId())
                .fullname(student.getFullname())
                .fathername(student.getFathername())
                .matricule(student.getMatricule())
                .email(student.getEmail())
                .build();
    }
}
