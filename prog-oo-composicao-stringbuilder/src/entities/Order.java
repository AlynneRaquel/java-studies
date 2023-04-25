package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enum.OrderStatus;

public class Order {
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss"); 
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> orderItens = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItens;
	}

	public void addItem(OrderItem orderItem) { 
		orderItens.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) { 
		orderItens.remove(orderItem);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem it : orderItens) {
			sum += it.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf1.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order Items: ");
		for(OrderItem item : orderItens) {
			sb.append(item + "\n");
		}
		
		sb.append("Total price: ");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}
	
	
	
}
