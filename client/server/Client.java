package client.server;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private double account;
	private List<Order> orders = new ArrayList<Order>();

	public Client() {

	}

	public Client(String name, double account) {
		this.name = name;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public List<Order> getOrder() {
		return orders;
	}

	private void addAccount(Order value) {
		account += value.getItemValue();
		orders.add(value);
	}
	
	public double findAndRemoveItem(Order item) {
		if (orders.contains(item)) {
			account -= item.getItemValue();
			orders.remove(item);
			return account;
		};
		
		return (Double)null;
	}

	public Order addItem(Order item) {
		if (item != null) {
			addAccount(item);
			return item;
		}
		return null;
	}
	
	public double getTotalAccount() {
		double total = 0;
		for (Order order : orders) {
			total += order.getItemValue();
		}
		
		return total;
	}
}
