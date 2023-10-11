package br.com.suzintech.loja;

import br.com.suzintech.loja.orcamento.ItemOrcamento;
import br.com.suzintech.loja.orcamento.Orcamento;
import br.com.suzintech.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal(200)));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal(500)));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
    }
}
