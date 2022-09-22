package br.edu.fafic.ppi.clinica.service;

import br.edu.fafic.ppi.clinica.domain.Medicamento;
import br.edu.fafic.ppi.clinica.repository.MedicamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MedicamentoService {

    private final MedicamentoRepository medicamentoRepository;

    public Medicamento save(Medicamento medicamento){
        return medicamentoRepository.save(medicamento);
    }

    public List<Medicamento> getAll(){
        return medicamentoRepository.findAll();
    }

    public void delete(Medicamento medicamento){
        medicamentoRepository.delete(medicamento);
    }

    public Medicamento findById(UUID id){
        return medicamentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Não tem medicamento " + id));
    }

    public List<Medicamento> findByDescricao(String descricao){
        return medicamentoRepository.findByDescricaoContaining(descricao);
    }
}
