package com.programming.team.service;

import com.programming.team.dto.CheckResponse;
import com.programming.team.model.Check;
import com.programming.team.repository.CheckRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CheckService {

    private final CheckRepository checkRepository;

    @Transactional(readOnly = true)
    public List<CheckResponse> isitRegisterInOurData(List<String> matricule) {

        return checkRepository.findByMatriculeIn(matricule).stream().map(check ->CheckResponse.builder()
                        .matricule(check.getMatricule()).isItStudent(check.getPresent()>0).build() )
        .toList();
    }


}
