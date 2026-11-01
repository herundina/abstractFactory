package com.br.herundina.dev.abstractFactory.Domain;

import com.br.herundina.dev.abstractFactory.Domain.ingrediente.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FichaTecnica extends Ingrediente {

    private String nomeProduto;
    private BigDecimal percentualFarinha;
    private BigDecimal percentuaAguaEGelo;
    private BigDecimal percentualSal;
    private BigDecimal percentualOleoDeSoja;
    private BigDecimal percentualFementoBiologicoSeco;
    private BigDecimal percentualDeMelhorador;
    private BigDecimal percentualDeLecitinaDeSoja;
    private BigDecimal percentualIngredientes;
}
