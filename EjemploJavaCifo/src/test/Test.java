package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Introduce tu edad");
		Scanner keybord = new Scanner(System.in);
		int age = keybord.nextInt();
		
		if( age <= 18) {
			System.out.println("Ets un ninyato");
		}else if ( age <= 25 && age > 18) {
			System.out.println("Ets Jove");
			
		}else if (age <= 40 && age > 25) {
			System.out.println(" Ets veterano");
		}else {
			System.out.println("Jubilat!!!");
		}
		
		
		

	}

}
