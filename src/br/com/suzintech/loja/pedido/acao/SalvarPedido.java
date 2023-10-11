package br.com.suzintech.loja.pedido.acao;

import br.com.suzintech.loja.pedido.Pedido;

public class SalvarPedido implements AcaoPedido {

    public void executar(Pedido pedido) {
        System.out.println("Salvando pedido!");
    }
}
