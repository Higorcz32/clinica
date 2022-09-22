package br.edu.fafic.ppi.clinica.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "Valor invalido para descrissão!")
    private String descricao;

    @Min(value = (long) 0.05, message = "O valor não pode ser menor do que cinco centavos!")
    private Double valor;

    public Medicamento(String descricao, Double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

}
