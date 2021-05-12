package personExample;

public class TestLocation {
	
	public static void executeLocation() {

		createAndTestObjectsLocation();

	}

	public static void createAndTestObjectsLocation() {

		// i am going to create an object WITHOUT parameters, that is a empty object
		
		Location location1 = new Location("House", 123154, 132103);
		
		Location location2 = new Location("Park", 45416, 15564);
		
	

		
		
		
		//dog1 object, that is, tag "dog1" calls toString Method
		location1.toString();
		location2.toString();
		
		// and now i am going to use toString to print this object
		System.out.println(location1.toString());
		System.out.println(location2.toString());
		
		//this Eclipse IDE allows me to use object without toString
		System.out.println(location1);
		
		System.out.println(location2);		
		
	}


}
