package com.karma.notificacao;

import com.karma.modelo.Cliente;

public interface Notificador {
	
	void notificar (Cliente cliente , String mensagem );

}
