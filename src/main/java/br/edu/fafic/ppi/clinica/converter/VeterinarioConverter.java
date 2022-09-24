package br.edu.fafic.ppi.clinica.converter;

import br.edu.fafic.ppi.clinica.domain.Veterinario;
import br.edu.fafic.ppi.clinica.dto.VeterinarioDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class VeterinarioConverter {

    private final ModelMapper modelMapper;

    public Veterinario convertToEntity(VeterinarioDTO veterinarioDTO){
        return modelMapper.map(veterinarioDTO, Veterinario.class);
    }

    public VeterinarioDTO convertToDTO(Veterinario veterinario){
        return modelMapper.map(veterinario, VeterinarioDTO.class);
    }
}
