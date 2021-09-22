package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeDeItens;
	private String situacao;

	public Orcamento(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
		if(situacao.equals("EM_ANALISE")) {
			valorDoDescontoExtra = new BigDecimal("0.05");
		} else {
			valorDoDescontoExtra = new BigDecimal("0.02");
		}
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao = 
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

}
