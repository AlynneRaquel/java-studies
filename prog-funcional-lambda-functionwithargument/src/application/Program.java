package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Celular", 350.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));
		
		ProductService ps = new ProductService();
		
		//uma funcao chamando a outra passando um predicado como argumento (p.getName().charAt(0) == 'T')
		//double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
