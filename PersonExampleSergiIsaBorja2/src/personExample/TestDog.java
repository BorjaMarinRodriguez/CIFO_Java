package personExample;

public class TestDog {

	

	public static void executeDog() {

		createAndTestObjectsDog();

	}

	public static void createAndTestObjectsDog() {

		// i am going to create an object WITHOUT parameters, that is a empty object
		
		Dog dog1 = new Dog("Dianka", 9, 40, "Doberman", true);
		
		Dog dog2 = new Dog("Noa", 4, 15, "Creuat", false);
		
		Person isa = new Person("Isa", 28);
		
		Location location1 = new Location("House", 123154, 132103);
		
		Location location2 = new Location("Park", 45416, 15564);
	

		
		
		
		//dog1 object, that is, tag "dog1" calls toString Method
		dog1.toString();
		dog2.toString();
		
		// and now i am going to use toString to print this object
		System.out.println(dog1.toString());
		
		//this Eclipse IDE allows me to use object without toString
		System.out.println(dog1);
		
		System.out.println(dog2);
		
		dog1.bark();
		dog1.toWalk(location1, location2);
		dog1.attackDog(dog2, isa);
		
		
		
		
	
	
	
	}

}
