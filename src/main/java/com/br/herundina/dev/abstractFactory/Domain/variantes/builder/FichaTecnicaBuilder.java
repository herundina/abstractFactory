package com.br.herundina.dev.abstractFactory.Domain.variantes.builder;

import com.br.herundina.dev.abstractFactory.Domain.fichaTecnica.FichaTecnicaAutomatizada;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface FichaTecnicaBuilder<T extends FichaTecnicaAutomatizada> {

    FichaTecnicaBuilder<T> nomeProduto(String nomeProduto);
    FichaTecnicaBuilder<T> pesoProduto(BigDecimal pesoProduto);
    FichaTecnicaBuilder<T> adicionarIngrediente(String ingrediente, BigDecimal percentualIngrediente);
    //FichaTecnicaBuilder<T> dataSolicitacao(LocalDateTime dt);

    T build();

}
