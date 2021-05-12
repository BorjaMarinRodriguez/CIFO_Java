package personExample;

public class TestDog {

	

	public static void executeDog() {

		createAndTestObjectsDog();

	}

	public static void createAndTestObjectsDog() {

		// i am going to create an object WITHOUT parameters, that is a empty object
		
		Dog dog1 = new Dog("Dianka", 9, 40, "Doberman", true);
		
		Dog dog2 = new Dog("Noa", 4, 15, "Creuat", false);
		
	

		
		
		
		//dog1 object, that is, tag "dog1" calls toString Method
		dog1.toString();
		dog2.toString();
		
		// and now i am going to use toString to print this object
		System.out.println(dog1.toString());
		
		//this Eclipse IDE allows me to use object without toString
		System.out.println(dog1);
		
		System.out.println(dog2);
		
		
	}

}
