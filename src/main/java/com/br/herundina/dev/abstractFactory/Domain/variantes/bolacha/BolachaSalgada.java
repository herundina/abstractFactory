package com.br.herundina.dev.abstractFactory.Domain.variantes.bolacha;

import com.br.herundina.dev.abstractFactory.Domain.fichaTecnica.FichaTecnicaAutomatizada;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolacha;
import com.br.herundina.dev.abstractFactory.Domain.variantes.pao.FichaTecnicaPaoCarioca;

public class BolachaSalgada implements Bolacha {

    private FichaTecnicaPaoCarioca ficha;

    public BolachaSalgada(FichaTecnicaPaoCarioca ficha) {
        this.ficha = ficha;
    }
    @Override
    public FichaTecnicaAutomatizada fichaTecnica() {
        return this.ficha;
    }
}
