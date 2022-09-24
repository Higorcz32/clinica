package br.edu.fafic.ppi.clinica.service;

import br.edu.fafic.ppi.clinica.domain.Veterinario;
import br.edu.fafic.ppi.clinica.repository.VeterinarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VeterinarioService {

    private final VeterinarioRepository veterinarioRepository;

    public Veterinario save(Veterinario veterinario){
        return veterinarioRepository.save(veterinario);
    }
}
