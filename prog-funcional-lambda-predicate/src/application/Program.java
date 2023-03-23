package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Celular", 350.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));
		
		//Quinta forma Express�o Lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		//Quarta forma Express�o Lambda Declarada
		 //Function<Product, String> func = p -> p.getName().toUpperCase();
		 //List<String> names = list.stream().map(func).collect(Collectors.toList());
				
		//Terceira forma refer�ncia com method n�o est�tico(classe product)
		 //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//Segunda forma reference method com m�todo est�tico(classe product)
		 //List<String> names = list.stream().map(Product::staticUppercaseName).collect(Collectors.toList());
		
		//Primeira forma usando a classe que extend consumer(implementa��o de interface)
		  //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		 
		 names.forEach(System.out::println);
	}
}