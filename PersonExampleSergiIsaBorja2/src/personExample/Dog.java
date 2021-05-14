package personExample;

public class Dog {
	
	public String name;
	public int age;
	public int heigth;
	public String race;
	boolean isPPP;
	
	
	public Dog(String name, int age, int heigth, String race, boolean isPPP) {
		
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		this.race = race;
		this.isPPP = isPPP;
	}
	
	public void bark() {
		
		System.out.println("Guau Guau");
		
	}
	
	public void toWalk(Location init , Location finaly ) {
		
		System.out.println("Es desplaça desde " +  init + " fins al " + finaly );
		
		
	}
	
	
	public static void attackDog (Dog dog1, Person person) {
		
			
		System.out.println(dog1 + "descuartitza a " + person);
		
		
	}
	
	


	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHeigth() {
		return heigth;
	}


	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public boolean isPPP() {
		return isPPP;
	}


	public void setPPP(boolean isPPP) {
		this.isPPP = isPPP;
	}



	@Override
	public String toString() {
		
		return "Dog Fields: (name=" + name + ", age=" + age + ", height=" + heigth + ", race=" + race + ", is PPP: " + isPPP + "\n";
	}
	
	
	
	
	

	
}

	