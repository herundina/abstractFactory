package com.br.herundina.dev.abstractFactory.Domain.variantes.bolo;

import com.br.herundina.dev.abstractFactory.Domain.variantes.Ingrediente;
import com.br.herundina.dev.abstractFactory.Domain.variantes.builder.FichaTecnicaBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BoloSalgadoBuilder implements FichaTecnicaBuilder<FichaTecnicaBoloSalgado> {

    private String ingrediente;
    private BigDecimal pesoProduto;
    private LocalDateTime dHCriacao;
    private List<Ingrediente> ingredientes = new ArrayList<>();


    @Override
    public FichaTecnicaBuilder<FichaTecnicaBoloSalgado> nomeProduto(String nomeProduto) {
        this.ingrediente = nomeProduto;
        return this;
    }

    @Override
    public FichaTecnicaBuilder<FichaTecnicaBoloSalgado> pesoProduto(BigDecimal pesoProduto) {
        this.pesoProduto=pesoProduto;
        return this;
    }

    @Override
    public FichaTecnicaBuilder<FichaTecnicaBoloSalgado> adicionarIngrediente(String ingrediente, BigDecimal percentualIngrediente) {
        this.ingredientes.add(new Ingrediente(ingrediente, percentualIngrediente));
        return this;
    }

    @Override
    public FichaTecnicaBoloSalgado build() {
        return new FichaTecnicaBoloSalgado(ingrediente, pesoProduto, ingredientes);
    }
}
