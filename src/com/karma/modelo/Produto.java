package com.karma.modelo;

import java.math.BigDecimal;

public class Produto {
	private String produto;
	private BigDecimal valorTotal;

	public Produto(String produto, BigDecimal valorTotal) {
		super();
		this.produto = produto;
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
