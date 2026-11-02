package com.br.herundina.dev.abstractFactory.Domain.variantes.bolacha;

import com.br.herundina.dev.abstractFactory.Domain.fichaTecnica.FichaTecnicaAutomatizada;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolacha;

import java.math.BigDecimal;

public class BolachaSalgada implements Bolacha {

    @Override
    public FichaTecnicaAutomatizada fichaTecnica() {
        FichaTecnicaAutomatizada fichaTecnicaAutomatizada = new FichaTecnicaAutomatizada();
        fichaTecnicaAutomatizada.setNomeProduto("Bolacha Salgada");
        fichaTecnicaAutomatizada.setPercentualIngredientes(new BigDecimal(3.3));
        return fichaTecnicaAutomatizada;
    }
}
