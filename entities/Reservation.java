package entities;

import java.util.List;

import client.server.Client;
import client.server.Order;

public class Reservation {
	private Client client;
	private int reservationNumber;
	private List<Order> reservationOrders;
	
	public Reservation() {
		
	}

	public Reservation(Client client, int reservationNumber, List<Order> reservationOrders) {
		this.client = client;
		this.reservationNumber = reservationNumber;
		this.reservationOrders = reservationOrders;
	}

	public Client getClient() {
		return client;
	}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public List<Order> getReservationOrders() {
		return reservationOrders;
	}

	
}
