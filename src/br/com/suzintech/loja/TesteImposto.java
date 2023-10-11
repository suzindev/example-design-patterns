package br.com.suzintech.loja;

import br.com.suzintech.loja.imposto.CalculadoraImposto;
import br.com.suzintech.loja.imposto.ICMS;
import br.com.suzintech.loja.imposto.ISS;
import br.com.suzintech.loja.orcamento.ItemOrcamento;
import br.com.suzintech.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal(100)));
        CalculadoraImposto calculadora = new CalculadoraImposto();

        System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
    }
}
