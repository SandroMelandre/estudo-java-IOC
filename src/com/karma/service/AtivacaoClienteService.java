package com.karma.service;

import com.karma.modelo.Cliente;
import com.karma.notificacao.Notificador;



/**
 * @author sandrO
 * @CLASSE DE SERVICO  PARA ATIVAÇÃO CLIENTE
 */
public class AtivacaoClienteService {
	
	//implementando atributo notificador
	private Notificador notificador;
	
	// Criando Construtor que recebe dependencia do notificador
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	
	public void  ativar (Cliente cliente) {
		
		cliente.setAtivo();
		this.notificador.notificar(cliente, "Seu cadastro está  ativo !");
		
		
	}
}
