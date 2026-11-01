package com.br.herundina.dev.abstractFactory.abstractFactory;

import com.br.herundina.dev.abstractFactory.produto.Bolacha;
import com.br.herundina.dev.abstractFactory.produto.Bolo;
import com.br.herundina.dev.abstractFactory.produto.Pao;

public interface AbstractFactory {

    public Pao criarPao();

    public Bolo criarBolo();

    public Bolacha criarBolacha();
}
