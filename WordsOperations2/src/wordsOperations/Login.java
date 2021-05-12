package wordsOperations;

import java.util.Scanner;

public class Login {
	
	public static boolean validateUser(String user, String password) {
		String userName = "";
		String userPass = "";
		
		
		Scanner reader = new Scanner (System.in);
		System.out.println("Introdueix el Usuari");
		userName = reader.nextLine();
		
		System.out.println("Introdueix el password");
		userPass = reader.nextLine();
		
			if(userName.equals(user) && userPass.equals(password)) {
				System.out.println("You are in");
				return true;
			}
			System.out.println("You are out");			
			return false;
	}
			
	}







