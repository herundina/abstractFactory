package com.br.herundina.dev.abstractFactory.variantes.pao;

import com.br.herundina.dev.abstractFactory.Domain.FichaTecnica;
import com.br.herundina.dev.abstractFactory.produto.Pao;
import com.br.herundina.dev.abstractFactory.variantes.pesoIngrediente.PesoDosIngredientes;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Slf4j
public class PaoSalgado implements Pao, PesoDosIngredientes {

    private final String NOME_PRODUTO = "Pão Carioca";
    private final BigDecimal PESO_PAO_CARIOCA = new BigDecimal(15.000);
    private final BigDecimal PERCENTUAL_FARINHA_DE_TRIGO = new BigDecimal(100);
    private final BigDecimal AGUA_E_GELO = new BigDecimal(60);
    private final BigDecimal PERCENTUAL_SAL = new BigDecimal(2);
    private final BigDecimal PERCENTUAL_OLEO_DE_SOJA = new BigDecimal(2);
    private final BigDecimal PERCENTUAL_FEMETO_BIOLOGICO_SECO = new BigDecimal(1);
    private final BigDecimal PERCENTUAL_DE_MELHORADOR = new BigDecimal(1);
    private final BigDecimal PERCENTUAL_DE_LECITINA_DE_SOJA = new BigDecimal(0.5);

    private BigDecimal percentual = this.calcularPercentuais();


    @Override
    public FichaTecnica fichaTecnica() {
        FichaTecnica ficha = new FichaTecnica();
        ficha.setNomeProduto(NOME_PRODUTO);
        BigDecimal gramaFarinhaDeTrigo = this.calcularGramasDeFarinhaDeTrigo();
        BigDecimal litroAguaEGelo = this.calcularLitrosDeAguaEGelo();
        BigDecimal gramaSal = this.calcularGramasDeSal();
        BigDecimal gramaOleoDeSoja = this.calcularGramasDeOleoDeSoja();
        BigDecimal gramaFementoBiologicoSeco = this.calcularGramasDeFementoBiologicoSeco();
        BigDecimal gramaMelhorador = this.calcularGramasDeMelhorador();
        BigDecimal gramaLecitinaDeSoja = this.calcularGramasDeLecitinaDeSoja();

        ficha.setPercentualFarinha(gramaFarinhaDeTrigo);
        ficha.setPercentuaAguaEGelo(litroAguaEGelo);
        ficha.setPercentualSal(gramaSal);
        ficha.setPercentualOleoDeSoja(gramaOleoDeSoja);
        ficha.setPercentualFementoBiologicoSeco(gramaFementoBiologicoSeco);
        ficha.setPercentualDeMelhorador(gramaMelhorador);
        ficha.setPercentualDeLecitinaDeSoja(gramaLecitinaDeSoja);
        ficha.setPercentualIngredientes(this.calcularPercentuais());
        return ficha;
    }

    private BigDecimal calcularGramasDeFarinhaDeTrigo(){
        return this.calcularPeso(PESO_PAO_CARIOCA, PERCENTUAL_FARINHA_DE_TRIGO, percentual);
    }

    private BigDecimal calcularLitrosDeAguaEGelo(){
        return this.calcularPeso(PESO_PAO_CARIOCA, AGUA_E_GELO, percentual);
    }

    private BigDecimal calcularGramasDeSal(){
        return this.calcularPeso(PESO_PAO_CARIOCA, PERCENTUAL_SAL, percentual);
    }

    private BigDecimal calcularGramasDeOleoDeSoja(){
        return this.calcularPeso(PESO_PAO_CARIOCA, PERCENTUAL_OLEO_DE_SOJA, percentual);
    }

    private BigDecimal calcularGramasDeFementoBiologicoSeco(){
        return this.calcularPeso(PESO_PAO_CARIOCA, PERCENTUAL_FEMETO_BIOLOGICO_SECO, percentual);
    }

    private BigDecimal calcularGramasDeMelhorador(){
        return this.calcularPeso(PESO_PAO_CARIOCA, PERCENTUAL_DE_MELHORADOR, percentual);
    }

    private BigDecimal calcularGramasDeLecitinaDeSoja(){
        return this.calcularPeso(PESO_PAO_CARIOCA, PERCENTUAL_DE_LECITINA_DE_SOJA, percentual);
    }


    @Override
    public BigDecimal calcularPeso(BigDecimal pesoDoProduto, BigDecimal percentualDoIngrediente, BigDecimal percentualTotal) {
        BigDecimal kg = pesoDoProduto.multiply(percentualDoIngrediente).divide(percentualTotal, 3, RoundingMode.HALF_UP);
        return this.converterParaGramas(kg);
    }

    @Override
    public BigDecimal calcularPercentuais() {
        return PERCENTUAL_FARINHA_DE_TRIGO.add(AGUA_E_GELO).add(PERCENTUAL_SAL)
                .add(PERCENTUAL_OLEO_DE_SOJA).add(PERCENTUAL_FEMETO_BIOLOGICO_SECO).add(PERCENTUAL_DE_MELHORADOR).add(PERCENTUAL_DE_LECITINA_DE_SOJA);
    }

    @Override
    public BigDecimal converterParaGramas(BigDecimal kilogramas) {
        BigDecimal gramas = new BigDecimal(1000);
        return kilogramas.multiply(gramas).setScale(0, RoundingMode.DOWN);
    }
}
