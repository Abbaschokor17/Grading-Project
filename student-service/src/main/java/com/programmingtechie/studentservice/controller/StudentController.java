package com.programmingtechie.studentservice.controller;

import com.programmingtechie.studentservice.dto.StudentRequest;
import com.programmingtechie.studentservice.dto.StudentResponse;
import com.programmingtechie.studentservice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentRequest studentRequest) {
        studentService.createStudent(studentRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentResponse> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleleStudent(@RequestBody StudentResponse studentResponse){
        studentService.deleteStudent(studentResponse);
    }

}
