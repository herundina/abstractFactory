package com.br.herundina.dev.abstractFactory.variantes.bolo;

import com.br.herundina.dev.abstractFactory.Domain.FichaTecnica;
import com.br.herundina.dev.abstractFactory.produto.Bolo;

import java.math.BigDecimal;

public class BoloSalgado implements Bolo {
    public FichaTecnica fichaTecnica() {
        FichaTecnica fichaTecnica = new FichaTecnica();
        fichaTecnica.setNomeProduto("Bolo Salgado");
        fichaTecnica.setPercentualIngredientes(new BigDecimal(3.3));
        return fichaTecnica;
    }
}
