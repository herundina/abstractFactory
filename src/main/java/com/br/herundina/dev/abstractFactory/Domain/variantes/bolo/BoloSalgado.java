package com.br.herundina.dev.abstractFactory.Domain.variantes.bolo;

import com.br.herundina.dev.abstractFactory.Domain.fichaTecnica.FichaTecnicaAutomatizada;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolo;

public class BoloSalgado implements Bolo {

    private FichaTecnicaBoloSalgado ficha;

    public BoloSalgado(FichaTecnicaBoloSalgado ficha) {
        this.ficha = ficha;
    }

    public FichaTecnicaAutomatizada fichaTecnica() {

        return this.ficha;
    }
}
