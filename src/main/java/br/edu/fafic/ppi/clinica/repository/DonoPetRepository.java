package br.edu.fafic.ppi.clinica.repository;


import br.edu.fafic.ppi.clinica.domain.DonoPet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DonoPetRepository extends JpaRepository<DonoPet, UUID> {
}
