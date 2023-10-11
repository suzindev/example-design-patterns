package br.com.suzintech.loja.desconto;

import br.com.suzintech.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoItens extends Desconto {

    public DescontoOrcamentoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
