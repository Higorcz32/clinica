package br.edu.fafic.ppi.clinica.repository;

import br.edu.fafic.ppi.clinica.domain.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VeterinarioRepository extends JpaRepository<Veterinario, UUID> {
}
