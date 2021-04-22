package test;

import java.util.Scanner;

public class Ticket {
	
	public static void main (String[] args) {
		
		int discount = 0;
		int totalDiscount = 0;
		int amountToPay = 0;
		
		while(true){
		
	
		Scanner reader = new Scanner (System.in);
		System.out.println("Tell me your user name:");
		String userName = reader.nextLine();
		
		System.out.println("Tell me your type of user:");
		String userType = reader.nextLine();
		
		System.out.println("Tell me the amount of your buy:");
		int userBuy = reader.nextInt();
		
		System.out.println("\nUser:");
		System.out.println("-------------------------\n");
		System.out.println("User Name: " + userName );
		System.out.println("User Type: " + userType );
		System.out.println("User Buy: " + userBuy );
		
	
		
		if (userType.equals("vip")) {
			//scope number #3
			discount = 25;
			totalDiscount = userBuy * 25 / 100;;
			amountToPay = userBuy - totalDiscount;
			printTicket( userBuy, discount, totalDiscount, amountToPay);
			// i have to code 25% discount
			//and print it to screen
		
			
			}else if (userType.equals("regular")) {
				// i have to code 15% discount
				discount = 15;
				totalDiscount = userBuy * 15 / 100;;
				amountToPay = userBuy - totalDiscount;
				printTicket( userBuy, discount, totalDiscount, amountToPay);
				// i have to code 25% discount
				//and print it to screen

			}else if (userType.equals("new")) {
				// i have to code 0% discount
				//and print it to screen
				discount = 0;
				totalDiscount = userBuy * 0 / 100;;
				amountToPay = userBuy - totalDiscount;
				printTicket( userBuy, discount, totalDiscount, amountToPay);
				
		
	}
		
		
		
		else {
			//scope number #4
			System.out.println(userName + " enter a customer type");
		}
		
		

		// I am closing the while so also the while scope
		
	}
	}

	
	public static void printTicket(int userBuy, int discount, int totalDiscount, int amountToPay) {
		//scope number #5
		System.out.println("\nTicket:");
		System.out.println("-------------------------\n");
		System.out.println("The amount of your buy is: " + userBuy);
		System.out.println("Your discount is: " + discount);
		System.out.println("Your total discount is: " + totalDiscount);
		System.out.println("Your should pay (with the discount): " + amountToPay + "\n");
	}
}
		

	
	