package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void Emitir(Cliente cliente, Produto produto) {
		
		this.notificador.notificar(cliente, "Nota Fiscal do produto"
				+ produto.getNome() + " Foi emitida!");
	}

}
