package principal;

import java.util.Locale;
import java.util.Scanner;

import client.server.Client;
import client.server.Order;
import entities.Menu;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		String clientName = "Rafael";
		int clientNumberAccount = 4020;
		
		System.out.println("Select what do would you like to do:");
		System.out.println("1 - Menu");
		System.out.println("2 - My Orders");
		System.out.println("3 - Cancel order");
		System.out.println("4 - Get account");
		System.out.println("5 - exit");
		String answer = sc.nextLine().trim();
		
		Client client = new Client(clientName, clientNumberAccount);
		do {
		
		
			switch (answer) {
			case "1": {
				String secondLoopAnswer = "yes";
				while (secondLoopAnswer.equals("yes")) {
					
				
				System.out.println("Menu:");
				Order orderList = new Order();
				int time = 1;
				for (Menu item : orderList.ListMenu()) {
					System.out.print(time + " - " + item + ". Value: ");
					System.out.printf("%.2f%n ", item.getPrice());
					time++;
				}
				System.out.println("Select 21 to leave");
				System.out.println("Would you like to order one of them ?");
				int orderNumberClient = sc.nextInt();
				sc.nextLine();
				if (orderNumberClient == 21) {
					break;
				} else {
					Order orderToAdd = new Order(orderList.ListMenu().get(orderNumberClient - 1), orderList.ListMenu().get(orderNumberClient - 1).getPrice());
					client.addItem(orderToAdd);
					System.out.println("Your order: " + orderList.ListMenu().get(orderNumberClient - 1));
				}
				System.out.println("Would you like to order anything else ? yes/no");
				secondLoopAnswer = sc.next().trim();
				sc.nextLine();
				}
				break;
			}
			case "2": {
				System.out.println("You selected 2");
				break;
			}
			case "3": {
				System.out.println("You selected 3");
				break;
			}
			case "4": {
				System.out.println("You selected 4");
				break;
			}
			case "5": {
				System.out.println("You selected 5");
				break;
			}
			default:
				System.out.println("Good bye");
				break;
			}
			System.out.println("Select what do would you like to do:");
			System.out.println("1 - Menu");
			System.out.println("2 - My Orders");
			System.out.println("3 - Cancel order");
			System.out.println("4 - Get account");
			System.out.println("5 - exit");
			answer = sc.nextLine().trim();
			
		} while (!answer.equals("5"));
		
	
		System.out.println("bye");

		sc.close();
	}
}
