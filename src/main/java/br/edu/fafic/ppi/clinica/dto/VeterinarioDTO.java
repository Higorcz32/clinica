package br.edu.fafic.ppi.clinica.dto;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class VeterinarioDTO {


    private String nome;
    private String crv;
    private String cpf;
    private ContatoDTO contato;
    private EnderecoDTO endereco;

}
