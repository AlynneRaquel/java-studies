package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Celular", 350.00));
		
		// 2 segunda forma de fazer com implementação de função anônima - lambda
		// p1 e p2 não foram declarados, são inferência de tipos
		list.sort((p1,p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		
		/** 1- forma de comparar usando  a classe MyComparator
		list.sort(new MyComparator()); **/
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
