package br.com.suzintech.loja;

import br.com.suzintech.loja.pedido.GeraPedido;
import br.com.suzintech.loja.pedido.GeraPedidoHandler;
import br.com.suzintech.loja.pedido.acao.EnviarEmailPedido;
import br.com.suzintech.loja.pedido.acao.LogPedido;
import br.com.suzintech.loja.pedido.acao.SalvarPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class AppPedido {

    public static void main(String[] args) {
        String cliente = "Teste";
        BigDecimal valorOrcamento = new BigDecimal(300);
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedido(),
                        new EnviarEmailPedido(),
                        new LogPedido())
        );
        handler.execute(gerador);
    }
}
