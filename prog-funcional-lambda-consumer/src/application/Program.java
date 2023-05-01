package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Celular", 350.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));
		
		//Quinta forma Expressão Lambda inline
		double factor = 1.1;
		
		list.forEach(produto -> produto.setPrice(produto.getPrice() * factor));
		
		//Quarta forma Expressão Lambda Declarada
		/**double factor = 1.1;
		
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		
		list.forEach(cons);**/
		
		
		//Terceira forma referência com method não estático(classe product)
		 //list.forEach(Product::nonStaticPriceUpdate);
		
		//Segunda forma reference method com método estático(classe product)
		 //list.forEach(Product::staticPriceUpdate);
		
		//Primeira forma usando a classe que extend consumer(implementação de interface)
		 //list.forEach(new PriceUpdate());
		 
		list.forEach(System.out::println);
	}
}