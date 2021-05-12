package mail;

import java.util.Scanner;

public class Editing {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introdueix el teu nom i cognom: ");
		String name = scanner.next();
		
		char posInitial = name.charAt(0);
		int posSurname = name.indexOf(" ");
		
		String surname = name.substring(posSurname);
		
		System.out.println(surname);
		

	}

}
