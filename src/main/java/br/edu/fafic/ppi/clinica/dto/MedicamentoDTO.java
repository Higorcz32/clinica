package br.edu.fafic.ppi.clinica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MedicamentoDTO {

    @NotBlank(message = "Valor invalido para descrissão!")
    private String descricao;

    @Min(value = (long) 0.05, message = "O valor não pode ser menor do que cinco centavos!")
    private Double valor;
}
