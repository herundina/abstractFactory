package com.br.herundina.dev.abstractFactory.Domain.Fabricas;

import com.br.herundina.dev.abstractFactory.Domain.abstractFactory.AbstractFactory;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolacha;
import com.br.herundina.dev.abstractFactory.Domain.produto.Bolo;
import com.br.herundina.dev.abstractFactory.Domain.produto.Pao;
import com.br.herundina.dev.abstractFactory.Domain.variantes.IngredienteEnum;
import com.br.herundina.dev.abstractFactory.Domain.variantes.bolacha.BolachaSalgada;
import com.br.herundina.dev.abstractFactory.Domain.variantes.bolo.BoloSalgado;
import com.br.herundina.dev.abstractFactory.Domain.variantes.bolo.BoloSalgadoBuilder;
import com.br.herundina.dev.abstractFactory.Domain.variantes.bolo.FichaTecnicaBoloSalgado;
import com.br.herundina.dev.abstractFactory.Domain.variantes.pao.FichaTecnicaPaoCarioca;
import com.br.herundina.dev.abstractFactory.Domain.variantes.pao.PaoCariocaBuilder;
import com.br.herundina.dev.abstractFactory.Domain.variantes.pao.PaoSalgado;

import java.math.BigDecimal;

public class FabricaDeProdutoSalgado implements AbstractFactory {

    @Override
    public Pao criarPao() {
        FichaTecnicaPaoCarioca ficha =
               new PaoCariocaBuilder()
                       .nomeProduto("Pão Carioca")
                       .pesoProduto(new BigDecimal(15))
                       .adicionarIngrediente(IngredienteEnum.FARINHA_DE_TRIGO.getNomeIngrediente(), new BigDecimal("100"))
                       .adicionarIngrediente(IngredienteEnum.OLEO_DE_SOJA.getNomeIngrediente(), new BigDecimal("2"))
                       .build();

        return new PaoSalgado(ficha);
    }

    @Override
    public Bolo criarBolo() {
        FichaTecnicaBoloSalgado ficha =
                new BoloSalgadoBuilder()
                        .nomeProduto("Bolo sem açucar")
                        .pesoProduto(new BigDecimal(15))
                        .adicionarIngrediente(IngredienteEnum.FARINHA_DE_TRIGO.getNomeIngrediente(), new BigDecimal("10.6"))
                        .adicionarIngrediente(IngredienteEnum.OLEO_DE_SOJA.getNomeIngrediente(), new BigDecimal("3.2"))
                        .build();
        return new BoloSalgado(ficha);
    }

    @Override
    public Bolacha criarBolacha() {
        FichaTecnicaPaoCarioca ficha =
                new PaoCariocaBuilder()
                        .nomeProduto("Bolacha Salgada")
                        .pesoProduto(new BigDecimal(15))
                        .adicionarIngrediente(IngredienteEnum.FARINHA_DE_TRIGO.getNomeIngrediente(), new BigDecimal("10.6"))
                        .adicionarIngrediente(IngredienteEnum.OLEO_DE_SOJA.getNomeIngrediente(), new BigDecimal("3.2"))
                        .build();
        return new BolachaSalgada(ficha);
    }
}
