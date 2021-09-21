package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaCincoItensOuMais(
				new DescontoParaComprasAcimaDeQuinhentosReais(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
