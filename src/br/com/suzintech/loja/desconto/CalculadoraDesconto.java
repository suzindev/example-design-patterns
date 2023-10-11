package br.com.suzintech.loja.desconto;

import br.com.suzintech.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoOrcamentoItens(
                new DescontoOrcamentoValor(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
