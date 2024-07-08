package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Reservation173;
import model.exceptions.DomainException;

public class Program173 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Room number:");
			int number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy):");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy):");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation173 reservation = new Reservation173(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date (dd/MM/yyyy):");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy):");
			checkOut = sdf.parse(sc.next());
			
			 reservation.updatesDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Unexpected error");
		}

		sc.close();

	}

}
