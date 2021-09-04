package com.karma;

import com.karma.modelo.Cliente;
import com.karma.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente jorge = new Cliente("Jorge","joao@xyz.com",false, "242233-4455");
		Cliente maria = new Cliente("Maria","maria@xyz.com",false, "245566-7788" );
		
		//notificação  por  email
		AtivacaoClienteService ativacaoClienteService =  new AtivacaoClienteService();	
		ativacaoClienteService.ativar(jorge);
		ativacaoClienteService.ativar(maria);
		

		
		
	}
}
