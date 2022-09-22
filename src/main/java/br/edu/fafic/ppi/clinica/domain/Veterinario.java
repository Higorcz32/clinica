package br.edu.fafic.ppi.clinica.domain;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "pessoaId")
public class Veterinario extends Pessoa {

    private String crv;

    @OneToMany(cascade = CascadeType.MERGE , mappedBy = "veterinario")
    private List<ConsultaMedica> consultaMedicas;
}
