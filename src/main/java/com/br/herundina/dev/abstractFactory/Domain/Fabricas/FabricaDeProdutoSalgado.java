package com.br.herundina.dev.abstractFactory.Domain.Fabricas;

import com.br.herundina.dev.abstractFactory.Domain.abstractFactory.AbstractFactory;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolacha;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolo;
import com.br.herundina.dev.abstractFactory.Domain.produto.Pao;
import com.br.herundina.dev.abstractFactory.Domain.variantes.bolacha.BolachaSalgada;
import com.br.herundina.dev.abstractFactory.Domain.variantes.bolo.BoloSalgado;
import com.br.herundina.dev.abstractFactory.Domain.variantes.pao.PaoSalgado;

public class FabricaDeProdutoSalgado implements AbstractFactory {

    @Override
    public Pao criarPao() {
        return new PaoSalgado();
    }

    @Override
    public Bolo criarBolo() {
        return new BoloSalgado();
    }

    @Override
    public Bolacha criarBolacha() {
        return new BolachaSalgada();
    }
}
