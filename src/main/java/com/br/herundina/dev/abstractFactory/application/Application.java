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
        log.info("Recebemos seu pedido!");
        log.info("Ficha Pao {} " , pao.fichaTecnica().toString());
        log.info("Ficha Bolo {} " , bolo.fichaTecnica().toString());
        log.info("Agora, confira o que tem em seu Combo ( {},  {}, {} ) ",
                pao.fichaTecnica().getProduto(),
                bolo.fichaTecnica().getProduto() ,
                bolacha.fichaTecnica().getProduto());
    }
}
