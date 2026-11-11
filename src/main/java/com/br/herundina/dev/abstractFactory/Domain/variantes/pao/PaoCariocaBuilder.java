package com.br.herundina.dev.abstractFactory.Domain.variantes.pao;

import com.br.herundina.dev.abstractFactory.Domain.variantes.Ingrediente;
import com.br.herundina.dev.abstractFactory.Domain.variantes.builder.FichaTecnicaBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PaoCariocaBuilder implements FichaTecnicaBuilder<FichaTecnicaPaoCarioca> {

    private String produto;
    private BigDecimal pesoProduto;
    private List<Ingrediente> ingredientes = new ArrayList<>();


    @Override
    public FichaTecnicaBuilder<FichaTecnicaPaoCarioca> nomeProduto(String nomeProduto) {
        this.produto = nomeProduto;
        return this;
    }

    @Override
    public FichaTecnicaBuilder<FichaTecnicaPaoCarioca> pesoProduto(BigDecimal pesoProduto) {
        this.pesoProduto = pesoProduto;
        return this;
    }

    @Override
    public FichaTecnicaBuilder<FichaTecnicaPaoCarioca> adicionarIngrediente(String ingrediente, BigDecimal percentualIngrediente) {
        this.ingredientes.add(new Ingrediente(ingrediente, percentualIngrediente));
        return this;
    }

    @Override
    public FichaTecnicaPaoCarioca build() {
        return new FichaTecnicaPaoCarioca(produto, pesoProduto, ingredientes);
    }
}
