package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Celular", 350.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));
		
		//quarta forma , expressão lambda declarada
		Double min = 100.00;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);
		
		//terceira forma method não estático
		//list.removeIf(Product::nonStaticProductPredicate);
		
		//segunda forma method estático
		//list.removeIf(Product::staticProductPredicate);
		
		//primeira forma usando a classe ProductPredicate implementação de interface
		//list.removeIf(new ProductPredicate());
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
