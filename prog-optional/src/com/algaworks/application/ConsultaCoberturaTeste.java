package com.algaworks.application;

import java.math.BigDecimal;
import java.util.Optional;

import com.algaworks.model.Seguro;

public class ConsultaCoberturaTeste {

	public static void main(String[] args) {
		Seguro seguro = new Seguro("Total com Fanquia reduzida  ", new BigDecimal("600"));
		
		
		//Usar esse op��o se tiver certeza que NUNCA ser� null
		// Optional<Seguro> seguroOptional = Optional.of(seguro);
		
		//Como seu eu colocasse dentro de uma caixa, posso ou n�o posso ter o obj
		Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);
		
		seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);

	}

}
