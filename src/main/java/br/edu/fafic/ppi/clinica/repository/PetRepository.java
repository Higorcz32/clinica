package br.edu.fafic.ppi.clinica.repository;

import br.edu.fafic.ppi.clinica.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PetRepository extends JpaRepository<Pet , UUID> {
}
