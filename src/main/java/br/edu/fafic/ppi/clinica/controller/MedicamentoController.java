package br.edu.fafic.ppi.clinica.controller;

import br.edu.fafic.ppi.clinica.domain.Medicamento;
import br.edu.fafic.ppi.clinica.dto.MedicamentoDTO;
import br.edu.fafic.ppi.clinica.service.MedicamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/medicamento")
@RequiredArgsConstructor
public class MedicamentoController {

    private final MedicamentoService medicamentoService;

    @PostMapping
    public ResponseEntity save(@RequestBody @Valid MedicamentoDTO medicamentoDTO){
        var medicamentoConveter = new Medicamento(medicamentoDTO.getDescricao(), medicamentoDTO.getValor());
        return ResponseEntity.status(HttpStatus.CREATED).body(medicamentoService.save(medicamentoConveter));
    }

    @GetMapping
    public ResponseEntity getAll(){
        var medicamentoGetAll = medicamentoService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(medicamentoGetAll);
    }

    @GetMapping("/{id}")
    public ResponseEntity findId(@PathVariable UUID id){
        try {
            var medicamento = medicamentoService.findById(id);
            return ResponseEntity.status(HttpStatus.OK).body(medicamento);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/descricao/{descricao}")
    public ResponseEntity findByDescricao (@PathVariable String descricao){
       return ResponseEntity.status(HttpStatus.OK).body(medicamentoService.findByDescricao(descricao));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Medicamento medicamento){
        var medicamentoSave = medicamentoService.save(medicamento);
        return ResponseEntity.status(HttpStatus.OK).body(medicamentoSave);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Medicamento medicamento){
        medicamentoService.delete(medicamento);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
