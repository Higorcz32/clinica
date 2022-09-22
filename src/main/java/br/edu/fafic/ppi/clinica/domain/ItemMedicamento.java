package br.edu.fafic.ppi.clinica.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemMedicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    private Medicamento medicamento;

    private Integer quant;

    private Double subTotal;

    public Double getSubTotal() {
        subTotal = medicamento.getValor() * quant;
        return subTotal;
    }
}
