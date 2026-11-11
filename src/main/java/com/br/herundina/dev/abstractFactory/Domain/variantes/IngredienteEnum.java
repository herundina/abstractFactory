package com.br.herundina.dev.abstractFactory.Domain.variantes;

public enum IngredienteEnum {

    FARINHA_DE_TRIGO("Farinha de Trigo"),
    AGUA_E_GELO("Água e Gelo"),
    SAL("Sal"),
    OLEO_DE_SOJA("Óleo de Soja"),
    FEMETO_BIOLOGICO_SECO("Fermento Biológico Seco");

    public String nomeIngrediente;

    public  String getNomeIngrediente() {
        return nomeIngrediente;
    }

   IngredienteEnum(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }
}
