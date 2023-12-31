package br.com.suzintech.loja.orcamento;

import br.com.suzintech.loja.exception.DomainException;
import br.com.suzintech.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado.");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url, dados);
    }
}
