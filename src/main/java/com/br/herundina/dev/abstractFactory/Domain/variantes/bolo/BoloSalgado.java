package com.br.herundina.dev.abstractFactory.Domain.variantes.bolo;

import com.br.herundina.dev.abstractFactory.Domain.fichaTecnica.FichaTecnicaAutomatizada;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolo;

import java.math.BigDecimal;

public class BoloSalgado implements Bolo {
    public FichaTecnicaAutomatizada fichaTecnica() {
        FichaTecnicaAutomatizada fichaTecnicaAutomatizada = new FichaTecnicaAutomatizada();
        fichaTecnicaAutomatizada.setNomeProduto("Bolo Salgado");
        fichaTecnicaAutomatizada.setPercentualIngredientes(new BigDecimal(3.3));
        return fichaTecnicaAutomatizada;
    }
}
