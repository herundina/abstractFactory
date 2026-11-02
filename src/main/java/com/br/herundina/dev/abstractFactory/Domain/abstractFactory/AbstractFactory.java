package com.br.herundina.dev.abstractFactory.Domain.abstractFactory;

import com.br.herundina.dev.abstractFactory.Domain.produto.Bolacha;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolo;
import com.br.herundina.dev.abstractFactory.Domain.produto.Pao;

public interface AbstractFactory {

    public Pao criarPao();

    public Bolo criarBolo();

    public Bolacha criarBolacha();
}
