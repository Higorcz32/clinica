package br.edu.fafic.ppi.clinica.service;

import br.edu.fafic.ppi.clinica.domain.DonoPet;
import br.edu.fafic.ppi.clinica.repository.DonoPetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonoPetService {

    private final DonoPetRepository donoPetRepository;

    public DonoPet save(DonoPet donoPet){
        return donoPetRepository.save(donoPet);
    }
}
