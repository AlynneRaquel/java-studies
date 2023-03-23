package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorSms;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@email.com", "87999914185");
		Cliente maria = new Cliente("Maria", "maria@email.com", "8796183777");
		
		Notificador notificador = new NotificadorSms();
		
		/* Injeção de Dependência  */
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(maria);
		ativacaoCliente.ativar(joao);
		
	}

}
