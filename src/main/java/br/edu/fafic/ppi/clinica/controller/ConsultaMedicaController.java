package br.edu.fafic.ppi.clinica.controller;

import br.edu.fafic.ppi.clinica.domain.ConsultaMedica;
import br.edu.fafic.ppi.clinica.service.ConsultaMedicaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultaMedica")
@RequiredArgsConstructor
public class ConsultaMedicaController {

    private final ConsultaMedicaService consultaMedicaService;

    @PostMapping
    public ResponseEntity save(@RequestBody ConsultaMedica consultaMedica){
        return ResponseEntity.status(HttpStatus.CREATED).body(consultaMedica);
    }
}
