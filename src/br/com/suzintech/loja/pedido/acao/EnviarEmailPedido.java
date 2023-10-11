package br.com.suzintech.loja.pedido.acao;

import br.com.suzintech.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando email para " + pedido.getCliente());
    }
}
