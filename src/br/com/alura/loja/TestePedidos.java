package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

public class TestePedidos {
	
	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeDeItens = Integer.parseInt(args[2]);
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
		
		handler.execute(gerador);
	}

}
