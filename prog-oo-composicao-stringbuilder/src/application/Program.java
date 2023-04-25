package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy"); 
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss"); 
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth Date: DD/MM/YYYY ");
		Date data = sdf.parse(sc.next());
		//System.out.println(" ");
		
		Client client = new Client(nome, email, data);
		
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		String status = sc.next();
		Date dataAtual = new Date(System.currentTimeMillis());
		
		
		Order order = new Order(dataAtual, OrderStatus.valueOf(status), client);
		
		System.out.println("How many items this order? ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			System.out.println("Enter" + i + " item data: ");
			System.out.println("Product name: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Product price: ");
			Double precoProduto = sc.nextDouble();
			
			Product product = new Product(nomeProduto, precoProduto);
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, precoProduto, product);
			
			order.addItem(orderItem);
			
		}
		
			System.out.println();
			System.out.println(order);
	
		
	}

}
