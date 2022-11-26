package com.programming.team.controller;

import com.programming.team.service.CheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/check")
@RequiredArgsConstructor
public class CheckController {

    private final CheckService checkService;

    @GetMapping("/{matricule}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isitRegisterInOurData(@PathVariable("matricule") String matricule) {
        return checkService.isitRegisterInOurData(matricule);
    }
}
