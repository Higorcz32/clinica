package br.edu.fafic.ppi.clinica.controller;

import br.edu.fafic.ppi.clinica.domain.DonoPet;
import br.edu.fafic.ppi.clinica.service.DonoPetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/donoPet")
@RequiredArgsConstructor
public class DonoPetController {

    private final DonoPetService donoPetService;

    @PostMapping
    public ResponseEntity save(@RequestBody DonoPet donoPet){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(donoPetService.save(donoPet));
        } catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }

    }
}
