package com.programming.team.service;

import com.programming.team.dto.JuryRequest;
import com.programming.team.dto.JuryResponse;
import com.programming.team.model.Jury;
import com.programming.team.repository.JuryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class JuryService {

    private final JuryRepository juryRepository;

    public void createJury(JuryRequest juryRequest) {
        Jury jury = Jury.builder()
                .fullname(juryRequest.getFullname())
                .email(juryRequest.getEmail())
                .build();

        juryRepository.save(jury);
        log.info("Jury {} is saved", jury.getId());
    }

    public void deleteJury(JuryResponse juryResponse){
        Jury jury = new Jury();
        jury.setId(juryResponse.getId());
         juryRepository.delete(jury);
        log.info("Jury {} is deleted",jury.getId());
    }

    public List<JuryResponse> getAllJurys() {
        List<Jury> jurys = juryRepository.findAll();

        return jurys.stream().map(this::mapToJuryResponse).toList();
    }

    private JuryResponse mapToJuryResponse(Jury jury) {
        return JuryResponse.builder()
                .id(jury.getId())
                .fullname(jury.getFullname())
                .email(jury.getEmail())
                .build();
    }
}
