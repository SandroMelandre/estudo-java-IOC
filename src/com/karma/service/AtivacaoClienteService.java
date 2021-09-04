package com.karma.service;

import com.karma.modelo.Cliente;
import com.karma.notificacao.NotificacaoSMS;
import com.karma.notificacao.NotificadorEmail;



/**
 * @author sandrO
 * @CLASSE DE SERVICO  PARA ATIVAÇÃO CLIENTE
 */
public class AtivacaoClienteService {

	public void  ativar (Cliente cliente) {
		
		cliente.setAtivo();
		NotificadorEmail notificadorEmail = new NotificadorEmail();
		notificadorEmail.notificar(cliente, "Seu cadastro está  ativo !");
		
		NotificacaoSMS  notificacaoSMS =  new NotificacaoSMS();
		notificacaoSMS.notificar(cliente, "Seu cadastro está ativo !");
		
		
	}
}
