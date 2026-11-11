package com.br.herundina.dev.abstractFactory.Domain.variantes.pao;

import com.br.herundina.dev.abstractFactory.Domain.fichaTecnica.FichaTecnicaAutomatizada;
import com.br.herundina.dev.abstractFactory.Domain.variantes.Ingrediente;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
@NoArgsConstructor
@ToString
public class FichaTecnicaPaoCarioca extends FichaTecnicaAutomatizada{

    private String produto;
    private BigDecimal pesoProduto;
    private LocalDateTime dHCriacao;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public FichaTecnicaPaoCarioca(String produto, BigDecimal pesoProduto, List<Ingrediente> in) {
        this.ingredientes = in;
        this.produto = produto;
        this.pesoProduto = pesoProduto;
        this.dHCriacao = this.dHCriacao();

        this.calculaPercentual();
        this.ingredientes();

    }

    @Override
    public List<Ingrediente> ingredientes() {
        List<Ingrediente> listaIngrediente = new ArrayList<>();

        for (Ingrediente in : ingredientes){
            BigDecimal kl = this.pesoProduto.multiply(in.getPorcentagemIngrediente())
                    .divide(new BigDecimal("166.5"), 6 , RoundingMode.HALF_DOWN);
            BigDecimal gr = this.converteKiloParaGramas(kl);
            in.setGramas(gr);
            listaIngrediente.add(in);

            log.info("Ingrediente: {} , porcentagem: {}% , gramas: {}g", in.getIngrediente(), in.getPorcentagemIngrediente(), gr);
            log.info("APi de Estoque");
        }
        return listaIngrediente;
    }

    @Override
    public BigDecimal calculaPercentual() {
         BigDecimal porcentagemIngrediente = this.ingredientes.stream()
                 .map(Ingrediente::getPorcentagemIngrediente)
                 .reduce(BigDecimal.ZERO, BigDecimal::add)
                 .setScale(0, RoundingMode.DOWN);
         return porcentagemIngrediente;
    }


    public BigDecimal converteKiloParaGramas(BigDecimal kilogramas) {
        BigDecimal kilograma = kilogramas.multiply(new BigDecimal("1000")).setScale(0, RoundingMode.HALF_DOWN);
        return kilograma;
    }

    @Override
    public LocalDateTime dHCriacao() {
        return LocalDateTime.now();
    }
}
