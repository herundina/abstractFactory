package com.br.herundina.dev.abstractFactory.Fabricas;

import com.br.herundina.dev.abstractFactory.abstractFactory.AbstractFactory;
import com.br.herundina.dev.abstractFactory.produto.Bolacha;
import com.br.herundina.dev.abstractFactory.produto.Bolo;
import com.br.herundina.dev.abstractFactory.produto.Pao;
import com.br.herundina.dev.abstractFactory.variantes.bolacha.BolachaSalgada;
import com.br.herundina.dev.abstractFactory.variantes.bolo.BoloSalgado;
import com.br.herundina.dev.abstractFactory.variantes.pao.PaoSalgado;

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
