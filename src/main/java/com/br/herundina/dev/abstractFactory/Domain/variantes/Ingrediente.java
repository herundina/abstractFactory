package com.br.herundina.dev.abstractFactory.Domain.variantes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Data
@NoArgsConstructor
public class Ingrediente {

    private String ingrediente;
    private BigDecimal porcentagemIngrediente;
    private BigDecimal gramas;

    public Ingrediente(String ingrediente, BigDecimal porcentagemIngrediente){
        this.ingrediente = ingrediente;
        this.porcentagemIngrediente = porcentagemIngrediente;
    }


}
