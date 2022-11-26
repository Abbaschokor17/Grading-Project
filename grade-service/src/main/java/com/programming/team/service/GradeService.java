package com.programming.team.service;

import com.programming.team.dto.GradeRequest;
import com.programming.team.dto.GradeResponse;
import com.programming.team.model.Grade;
import com.programming.team.repository.GradeRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class GradeService {

    private final GradeRepository gradeRepository;

    public void createGrade(GradeRequest gradeRequest) {
        Grade grade = Grade.builder()
                .nameOfjury(gradeRequest.getNameOfjury())
                .numberofgroup(gradeRequest.getNumberofgroup())
                .citerecentdevelopmentspertainingtoanengineeringfield(gradeRequest.getCiterecentdevelopmentspertainingtoanengineeringfield())
                .constraints(gradeRequest.getConstraints())
                .futureworkplan(gradeRequest.getFutureworkplan())
                .projectobjectivesexpectedoutcomes(gradeRequest.getProjectobjectivesexpectedoutcomes())
                .requirements(gradeRequest.getRequirements())
                .slidesquality(gradeRequest.getSlidesquality())
                .solutionsprecifications(gradeRequest.getSolutionsprecifications())
                .oralcommunicationskills(gradeRequest.getOralcommunicationskills())
                .build();

        gradeRepository.save(grade);
        log.info("Grade of group {} by {} is saved ", grade.getNumberofgroup(),grade.getNameOfjury());
    }

    public void deleteGrade(GradeResponse gradeResponse){
        Grade grade = new Grade();
        grade.setId(gradeResponse.getId());
        gradeRepository.delete(grade);
        log.info("Grade of group {} by {} is deleted",grade.getNumberofgroup(),grade.getNameOfjury());
    }

    public List<GradeResponse> getAllGrades() {
        List<Grade> grades = gradeRepository.findAll();

        return grades.stream().map(this::mapToGradeResponse).toList();
    }

    private GradeResponse mapToGradeResponse(Grade grade) {
        return GradeResponse.builder()
                .Id(grade.getId())
                .nameOfjury(grade.getNameOfjury())
                .numberofgroup(grade.getNumberofgroup())
                .citerecentdevelopmentspertainingtoanengineeringfield(grade.getCiterecentdevelopmentspertainingtoanengineeringfield())
                .constraints(grade.getConstraints())
                .futureworkplan(grade.getFutureworkplan())
                .projectobjectivesexpectedoutcomes(grade.getProjectobjectivesexpectedoutcomes())
                .requirements(grade.getRequirements())
                .slidesquality(grade.getSlidesquality())
                .solutionsprecifications(grade.getSolutionsprecifications())
                .oralcommunicationskills(grade.getOralcommunicationskills())
                .build();
    }
}
