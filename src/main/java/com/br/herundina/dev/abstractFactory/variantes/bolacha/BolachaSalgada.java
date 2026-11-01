package com.br.herundina.dev.abstractFactory.variantes.bolacha;

import com.br.herundina.dev.abstractFactory.Domain.FichaTecnica;
import com.br.herundina.dev.abstractFactory.produto.Bolacha;

import java.math.BigDecimal;

public class BolachaSalgada implements Bolacha {

    @Override
    public FichaTecnica fichaTecnica() {
        FichaTecnica fichaTecnica = new FichaTecnica();
        fichaTecnica.setNomeProduto("Bolacha Salgada");
        fichaTecnica.setPercentualIngredientes(new BigDecimal(3.3));
        return fichaTecnica;
    }
}
