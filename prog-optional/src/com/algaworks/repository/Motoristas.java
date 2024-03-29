package com.algaworks.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;

public class Motoristas {
	
	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();
	
	public Motoristas() {
		Seguro seguro = new Seguro("Parcial - N�o cobre Roubo", new BigDecimal("5000"));
		Caminhao caminhao = new Caminhao("Mercedes Atron", Optional.ofNullable(seguro));
		
		Optional<Motorista> motoristaJoao = Optional.of( new Motorista("Jo�o", 40, Optional.ofNullable(caminhao)));
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("Jose", 25, Optional.ofNullable(null)));
		
		motoristas.put("Jo�o", motoristaJoao);
		motoristas.put("Jose", motoristaJose);
		
	}
	
	public Optional<Motorista> PorNome(String nome) {
		return motoristas.get(nome);
	}
	

	

}
