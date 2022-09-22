package br.edu.fafic.ppi.clinica.repository;

import br.edu.fafic.ppi.clinica.domain.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MedicamentoRepository extends JpaRepository<Medicamento, UUID> {

    List<Medicamento> findByDescricaoContaining(String descricao);

}
