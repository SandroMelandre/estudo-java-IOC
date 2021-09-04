package com.karma.modelo;

import java.math.BigDecimal;

public class Produto {
	private String nome;
	private BigDecimal valorTotal;

	public Produto(String produto, BigDecimal valorTotal) {
		super();
		this.nome = produto;
		this.valorTotal = valorTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String produto) {
		this.nome = nome;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
