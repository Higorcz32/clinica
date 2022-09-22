package br.edu.fafic.ppi.clinica.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.Email;

@Embeddable
@Data
public class Contato {

    @Email(message = "Email inválido")
    private String email;

    private String telefone;
}
