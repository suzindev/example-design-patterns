package br.com.suzintech.loja.orcamento.situacao;

import br.com.suzintech.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
