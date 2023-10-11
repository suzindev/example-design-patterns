package br.com.suzintech.loja.pedido.acao;

import br.com.suzintech.loja.pedido.Pedido;

public class LogPedido implements AcaoPedido {

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido foi gerado...");
    }
}
