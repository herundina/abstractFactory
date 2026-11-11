package com.br.herundina.dev.abstractFactory.Domain.variantes.pao;

import com.br.herundina.dev.abstractFactory.Domain.fichaTecnica.FichaTecnicaAutomatizada;
import com.br.herundina.dev.abstractFactory.Domain.produto.Pao;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Slf4j
public class PaoSalgado implements Pao {

    private FichaTecnicaPaoCarioca ficha;

    public PaoSalgado(FichaTecnicaPaoCarioca ficha){
        this.ficha = ficha;
    }

    @Override
    public FichaTecnicaAutomatizada fichaTecnica() {

        return this.ficha;
    }


}
