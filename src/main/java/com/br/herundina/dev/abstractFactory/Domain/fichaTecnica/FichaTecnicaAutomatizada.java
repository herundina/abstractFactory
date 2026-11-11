package com.br.herundina.dev.abstractFactory.Domain.fichaTecnica;

import com.br.herundina.dev.abstractFactory.Domain.variantes.Ingrediente;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@ToString
public abstract class FichaTecnicaAutomatizada {

    protected String produto;
    public abstract List<Ingrediente> ingredientes();
    public abstract BigDecimal calculaPercentual();
    public abstract BigDecimal converteKiloParaGramas(BigDecimal kilogramas);
    public abstract LocalDateTime dHCriacao();

}
