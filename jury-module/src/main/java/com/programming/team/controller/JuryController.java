package com.programming.team.controller;

import com.programming.team.dto.JuryRequest;
import com.programming.team.dto.JuryResponse;
import com.programming.team.service.JuryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jury")
@RequiredArgsConstructor
public class JuryController {

    private final JuryService juryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createJury(@RequestBody JuryRequest juryRequest) {
        juryService.createJury(juryRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<JuryResponse> getAllJurys() {
        return juryService.getAllJurys();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleleJury(@RequestBody JuryResponse juryResponse){
        juryService.deleteJury(juryResponse);
    }

}
