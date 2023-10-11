package br.com.suzintech.loja.pedido;

import br.com.suzintech.loja.orcamento.Orcamento;
import br.com.suzintech.loja.pedido.acao.AcaoPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoPedido> acoes;

    public GeraPedidoHandler(List<AcaoPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executar(pedido));
    }
}
