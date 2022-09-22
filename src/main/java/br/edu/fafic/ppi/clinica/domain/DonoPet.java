package br.edu.fafic.ppi.clinica.domain;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "pessoaId")
public class DonoPet extends Pessoa {

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Pet> pets;
}
