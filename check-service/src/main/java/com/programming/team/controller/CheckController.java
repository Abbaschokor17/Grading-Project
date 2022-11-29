package com.programming.team.controller;

import com.programming.team.dto.CheckResponse;
import com.programming.team.service.CheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/check")
@RequiredArgsConstructor
public class CheckController {

    private final CheckService checkService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CheckResponse> isitRegisterInOurData(@RequestParam List<String> matricule) {
        return checkService.isitRegisterInOurData(matricule);
    }
}
