package com.karma.notificacao;

import com.karma.modelo.Cliente;

public class NotificacaoSMS implements Notificador{
	
	@Override
	public void notificar (Cliente cliente, String  mensagem) {
		System.out.printf("Notificando  %s  por SMS  através do telefone %s: %s \n",
				cliente.getNome(), cliente.getTelefone(), mensagem );
		
		
	}

}
