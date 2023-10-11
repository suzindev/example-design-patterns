package br.com.suzintech.loja;

import br.com.suzintech.loja.http.HttpClient;
import br.com.suzintech.loja.orcamento.ItemOrcamento;
import br.com.suzintech.loja.orcamento.Orcamento;
import br.com.suzintech.loja.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registro = new RegistroOrcamento(new HttpClient());
        registro.registrar(orcamento);
    }
}
