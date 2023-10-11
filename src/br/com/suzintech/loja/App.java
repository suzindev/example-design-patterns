package br.com.suzintech.loja;

import br.com.suzintech.loja.desconto.CalculadoraDesconto;
import br.com.suzintech.loja.orcamento.ItemOrcamento;
import br.com.suzintech.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal(200)));
        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal(1000)));

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
