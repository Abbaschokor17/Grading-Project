package com.programming.team.service;

import com.programming.team.repository.CheckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class CheckService {

    private final CheckRepository checkRepository;

    @Transactional(readOnly = true)
    public boolean isitRegisterInOurData(String matricule) {
        return checkRepository.findByMatricule(matricule).isPresent();
    }
}
