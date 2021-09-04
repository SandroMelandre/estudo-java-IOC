package com.karma.service;

import com.karma.modelo.Cliente;
import com.karma.modelo.Produto;
import com.karma.notificacao.Notificador;

public class EmicaoNotafiscalService {

	// implementando atributo notificador
	private Notificador notificador;

	// Criando Construtor que recebe dependencia do notificador
	public EmicaoNotafiscalService(Notificador notificador) {
				this.notificador = notificador;
			}

	public void emitir(Cliente cliente, Produto produto) {

		this.notificador.notificar(cliente, "Nota fiscal do produto "
				+ produto.getNome()+ " foi emitida!");

	}
}
