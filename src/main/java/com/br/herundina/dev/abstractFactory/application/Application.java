package com.br.herundina.dev.abstractFactory.application;

import com.br.herundina.dev.abstractFactory.Domain.abstractFactory.AbstractFactory;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolacha;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolo;
import com.br.herundina.dev.abstractFactory.Domain.produto.Pao;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class Application {
    private Pao pao;
    private Bolo bolo;
    private Bolacha bolacha;

    public Application(AbstractFactory factory){
        this.pao = factory.criarPao();
        this.bolo = factory.criarBolo();
        this.bolacha = factory.criarBolacha();
    }

    public void imprimirProdutos(){
        log.info("Seu combo Foi criado!");
        log.info("Agora, confira o que tem no seu Combo ( {}, {}, {} ) ",
                pao.fichaTecnica().getNomeProduto() ,
                bolo.fichaTecnica().getNomeProduto() ,
                bolacha.fichaTecnica().getNomeProduto());
    }
}
