package br.edu.fafic.ppi.clinica.domain;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "O nome não pode ser vazio ou nulo")
    private String nome;

    @NotNull(message = "O CPF não pode ser nulo")
    @CPF(message = "CPF não é válido")
    private String cpf;

    @Embedded
    private Contato contato;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
