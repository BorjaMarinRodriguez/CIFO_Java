package personExample;

import java.util.ArrayList;

public class TestPerson {

	public static void executePerson() {

		createAndTestObjectsPerson();
		testExpensesPerson();
		testDisplacementPerson();

	}

	public static void createAndTestObjectsPerson() {

		// i am going to create an object WITHOUT parameters, that is a empty object
		Person sergi = new Person();
		
		Person isa = new Person ("Isabel", 18);
		
		Person toni = new Person ("Antonio", 30, 80, 180, 2000);
		
		Person carles = new Person ("Borja",18, 15,0 );
		
		Person borja2 = new Person ("Borja",18, 15,0 );
		
		carles.toString();
		System.out.println(carles);
		
//		borja.isAdult(15);
//		borja.isAdult(18);
//		
//		borja.tobaccoBuy(1);
//		borja.tobaccoBuy(5);
//		
//		borja.smoking(1);
//		borja.smoking(0);
		
		borja2.smoking();
		borja2.tobaccoBuy(1);
		
		// an object with just a pair of parameters: name and age
		

		// an object with all the parameters used
		
		// sergi object, that is, tag "sergi" calls toString Method
		sergi.toString();

		// and now i am going to use toString to print this object
		System.out.println(sergi.toString());

		// this Eclipse IDE allows me to use object without toString
		System.out.println(toni);

		System.out.println(isa);

		sergi.setName("Sergi");
		sergi.setAge(20);
		sergi.setWeigth(60);
		sergi.setHeigth(180);
		sergi.setBasicSalary(2000);

		System.out.println(sergi);

		System.out.println("Sergi's age: " + sergi.getAge() + "\n");

		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 30 years old

		toni.becomeOlder();

		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 31 years old
		
		
		
		
		
	}

	public static void testMethodsObjectsPerson() {

		// test yearNetSalary() method

		Person alexa = new Person("Alexa", 25, 60, 180, 2500);

		System.out.println("Alexa year net Salary is: " + alexa.yearNetSalary());

		Person jack = new Person("Jackson Pollock", 25);

		System.out.println("Jack year net Salary is: " + jack.yearNetSalary());
	}

	public static void testListObjectsPerson() {

		// create a variable people that is a ArrayList and assign a new ArrayList which
		// points to Person
		ArrayList<Person> people = new ArrayList<Person>();

		// create three Person Objects
		// remember: i need three constructors!!!
		Person alexa = new Person("Alexa", 25, 60, 180, 2500); // 5 parameters: string, int, int, int, int
		Person jack = new Person("Jackson Pollock", 25); // 2 parameters, string, int
		Person marc = new Person(); // 0 parameters

		// we add the previous created objects to People ArrayList
		people.add(alexa);
		people.add(marc);
		people.add(jack);

		// What do?
		// print people
		// How it works?
		// call printPeople -static method- with parameter people
		// people is an ArrayList of Person objects
		printPeople(people);

		// System.out.println(people.toString());
		
		System.out.println();

	}
	
	public static void testExpensesPerson() {
		
		Person borja = new Person ("Borja", 18, 180, 60, 3000);
		
		System.out.println(borja);
		
		//option A
		
		MyDate mondayMorning = new MyDate (4, 5, 2021);
		Expense internetYoigoApril = new Expense ("Internet 200MB Yoigo", 30, mondayMorning);
		
		borja.getExpenses().add(internetYoigoApril);
		
		MyDate lastSundayDate = new MyDate (14, 5 , 2021);
		Expense lastSundayFun = new Expense ("Bar and drinks and friends",110, lastSundayDate);
		
		borja.getExpenses().add(lastSundayFun);
		
		MyDate lastSaturdayDate = new MyDate (14, 6 , 2021);
		Expense lastSaturdayFun = new Expense ("Bar and drinks and friends",110, lastSaturdayDate);
		
		borja.getExpenses().add(lastSaturdayFun);
		
		//option B
		
		
		borja.expenses.add(new Expense("Internet 200MB Yoigo", 40, new MyDate (1,5,2021)));
		
		System.out.println("Expenses: " + borja.calculateExpenses(5));
		
		
	}
	
	public static void testDisplacementPerson() {
		
		Location location1 = new Location("House", 123154, 132103);
		
		Location location2 = new Location("Park", 45416, 15564);
		
		MyDate date = new MyDate(9,3,79);
		
		Displacement displacement = new Displacement("Despla?ament 1", location1, location2, date);
		
		Expense expense = new Expense("Entrep?", 5, date);
		
		
		
		Person borja = new Person ( );
		
		borja.setAge(42);
		borja.getExpenses().add (expense);
		borja.getDisplacements().add(displacement);
		
		System.out.println(borja);
		System.out.println(borja.getExpenses());
		System.out.println(borja.getDisplacements());
		
		
		
		//public Person(String name, int age, int weigth, int heigth, double basicSalary, double money, int tobaccoPacket,
			//	ArrayList<Expense> expenses, ArrayList<Displacement> displacements)
		
	}
	// -------------------------------------------------------------------
	// ------- utils -----------------------------------------------------
	// -------------------------------------------------------------------
	public static void printPeople(ArrayList<Person> arrayToPrint) {

		System.out.println("People:\n");

		for (Person personToPrint : arrayToPrint) {
			System.out.println(personToPrint);
		}
		System.out.println("\n");

	}

}
		
		
		
		
		
		

		
		
		
		//sergi object, that is, tag "sergi" calls toString Method
		//sergi.toString();
		
		// and now i am going to use toString to print this object
		//System.out.println(sergi.toString());
		
		//this Eclipse IDE allows me to use object without toString
		//System.out.println(toni);
		
		//System.out.println(isa);
		
		
		
		
	