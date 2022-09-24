package br.edu.fafic.ppi.clinica.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Prescricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String recomendacao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemMedicamento> listaMedicamentos;

}
