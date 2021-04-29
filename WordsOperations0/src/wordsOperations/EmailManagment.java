package wordsOperations;

import java.util.Random;
//import java.util.Scanner;

public class EmailManagment {
	
	
	
	

	public static void createAccount(String word) {
		
		//testRandom();
		
		String user = createUser(word);
		String email = createEmail(word);
		String password = createPassword();
		printUserAccount(user, email, password);

	}

	public static void testRandom() {
		
		String password = "_";

		int count = 0;
		while (count < 5) {
			int i = createIntRandom(10000);
			char j = createCharRandom();

			password = password + i + j;

			System.out.println(password);
			count++;

		}

		System.out.println(createIntRandom(1500));
		System.out.println(createCharRandom());
		System.out.println(createIntRandom(200));
		System.out.println(createCharRandom());

	}
	
	public static String createUser (String word) {
			int positionBlank = word.indexOf(" ");
			String user = word.substring(0,positionBlank);
		
		return user;
		}
	
	public static String createEmail (String word) {
		char initial = word.charAt(0);
		int positionBlank = word.indexOf(" ");
		String email =  initial + word.substring(positionBlank + 1 , word.length ()) + "@java.com";
		
		return email.toLowerCase();
		}
	
	public static String createPassword () {
		// to-do
		String password = "";
		
		int count = 0;
		while (count < 3) {
			int i = createIntRandom(100);
			char j = createCharRandom();

			password = password + i + j;

			
			count++;
		}
		
		
		return password;
		}
	
	public static void printUserAccount (String user, String email, String password) {
			System.out.println("Les teves dades del teu compte:");
			System.out.println("------------------------------");
			System.out.println("El teu usuari és: " + user);
			System.out.println("El teu email és: " + email);
			System.out.println("El teu password és: " + password);
			
		}

	public static int createIntRandom(int top) {

		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		return rand.nextInt(top);

	}

	public static char createCharRandom() {

		Random rand = new Random();
		String alphabetChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars.charAt(createIntRandom(alphabetChars.length()));

		return charRandom;

	}

}
