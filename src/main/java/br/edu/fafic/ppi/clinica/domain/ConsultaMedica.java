package br.edu.fafic.ppi.clinica.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsultaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    private Veterinario veterinario;

    @OneToOne
    private Pet pet;

    private LocalDate localDate;

    private Double valor;

    @OneToOne(cascade = CascadeType.ALL)
    private Prescricao prescricao;
}
