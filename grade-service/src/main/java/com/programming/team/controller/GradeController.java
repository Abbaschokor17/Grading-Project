package com.programming.team.controller;

import com.programming.team.dto.GradeRequest;
import com.programming.team.dto.GradeResponse;
import com.programming.team.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/grade")
@RequiredArgsConstructor
public class GradeController {

    private final GradeService gradeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createGrade(@RequestBody GradeRequest juryRequest) {
        gradeService.createGrade(juryRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GradeResponse> getAllGrades() {
        return gradeService.getAllGrades();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteGrade(@RequestBody GradeResponse gradeResponse){
        gradeService.deleteGrade(gradeResponse);
    }

}
