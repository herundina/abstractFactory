package com.br.herundina.dev.abstractFactory.variantes.pesoIngrediente;

import java.math.BigDecimal;

public interface PesoDosIngredientes {
    BigDecimal calcularPeso(BigDecimal pesoDoProduto, BigDecimal percentualDoIngrediente, BigDecimal percentualTotal);
    BigDecimal calcularPercentuais();
    BigDecimal converterParaGramas(BigDecimal kilogramas);

}
