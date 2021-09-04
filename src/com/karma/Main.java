package com.karma;

import com.karma.modelo.Cliente;
import com.karma.notificacao.NotificacaoSMS;
import com.karma.notificacao.Notificador;
import com.karma.notificacao.NotificadorEmail;
import com.karma.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		
		//Exemplo IOC criando o notificadorEmail para ser usado na ativacaoClienteService
		Notificador notificadorEmail = new NotificadorEmail();
		
		//Exemplo IOC o notificadorSMS para ser usado na ativacaoClienteService
		Notificador notificadorSMS = new NotificacaoSMS();
		
		
		
		Cliente jorge = new Cliente("Jorge","joao@xyz.com",false, "242233-4455");
		Cliente maria = new Cliente("Maria","maria@xyz.com",false, "245566-7788" );
		
		//notificação  por  email
		AtivacaoClienteService ativacaoClienteService =  new AtivacaoClienteService(notificadorSMS);	
		ativacaoClienteService.ativar(jorge);
		ativacaoClienteService.ativar(maria);
		

		
		
	}
}
