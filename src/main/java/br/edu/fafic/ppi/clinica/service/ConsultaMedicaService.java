package br.edu.fafic.ppi.clinica.service;

import br.edu.fafic.ppi.clinica.domain.ConsultaMedica;
import br.edu.fafic.ppi.clinica.repository.ConsultaMedicaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ConsultaMedicaService {

    private final ConsultaMedicaRepository consultaMedicaRepository;

    public ConsultaMedica save(ConsultaMedica consultaMedica){
        consultaMedica.setLocalDate(LocalDate.now());
        return consultaMedicaRepository.save(consultaMedica);
    }

}
