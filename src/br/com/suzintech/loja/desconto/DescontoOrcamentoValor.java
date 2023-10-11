package br.com.suzintech.loja.desconto;

import br.com.suzintech.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoValor extends Desconto {

    public DescontoOrcamentoValor(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal(500)) > 0;
    }
}
