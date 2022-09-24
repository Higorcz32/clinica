package br.edu.fafic.ppi.clinica.controller;

import br.edu.fafic.ppi.clinica.converter.VeterinarioConverter;
import br.edu.fafic.ppi.clinica.domain.Veterinario;
import br.edu.fafic.ppi.clinica.dto.VeterinarioDTO;
import br.edu.fafic.ppi.clinica.service.VeterinarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veterinario")
@RequiredArgsConstructor
public class VeterinarioController {

    private final VeterinarioService veterinarioService;

    private final VeterinarioConverter veterinarioConverter;

    @PostMapping
    public ResponseEntity save(@RequestBody VeterinarioDTO veterinarioDTO){
        Veterinario veterinario = veterinarioConverter.convertToEntity(veterinarioDTO);
        Veterinario veterinarioSave = veterinarioService.save(veterinario);
        return ResponseEntity.status(HttpStatus.CREATED).body(veterinarioConverter.convertToDTO(veterinarioSave));
    }
}
