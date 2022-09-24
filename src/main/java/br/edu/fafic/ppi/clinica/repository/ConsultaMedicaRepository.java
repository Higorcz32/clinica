package br.edu.fafic.ppi.clinica.repository;

import br.edu.fafic.ppi.clinica.domain.ConsultaMedica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConsultaMedicaRepository extends JpaRepository<ConsultaMedica, UUID> {
}
