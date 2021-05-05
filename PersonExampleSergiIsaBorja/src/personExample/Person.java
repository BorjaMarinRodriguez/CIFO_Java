package personExample;

public class Person {

	//fields from Person Class
	public String name;
	public int age;
	public int weigth;
	public int heigth;
	public double basicSalary;
	// Creem les dues variables necessÓries 
	public double money;
	public int tobaccoPacket;
	
	
	//Constructor from Person Class
	public Person() {
		
	}

	public Person(String name, int age, int weigth, int heigth, double basicSalary) {
		
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
		double yearNetSalary = 0.0;
		
	}

	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	// Nou constructor 
	public Person(String name, int age, double money, int tobaccoPacket) {
		
		this.name = name;
		this.age = age;
		this.money = money;
		this.tobaccoPacket = tobaccoPacket;
		
	}

	//Methods from Person Class
	
	public void becomeOlder () {
		
		this.age = age + 1;
	}
	
	/*
	 * public double yearNetSalary (double basicSalary) {
	 * 
	 * 
	 * return this.yearNetSalary;
	 * 
	 * }
	 */
	
	public boolean isAdult(int age) {
		
		if( age >= 18) {
			System.out.println("Ets major d'edat");
		
			return true;
		}
			System.out.println("Ets menor d'edat");
			return false;
	}
	
	
	public boolean tobaccoBuy(int tobaccoPacket) {
		if( (isAdult(age) == true) && (money >= 5 * tobaccoPacket)) {
			
			tobaccoPacket ++;
			money -= 5;
			System.out.println(" Pots comprar tabac i et queden " + money );
			return true;
		}
			System.out.println("No pots comprar tabac");
			return false;
		}
	
	public boolean smoking () {
		if( tobaccoPacket > 0) {
			System.out.println("Estic fumant");
			tobaccoPacket --;
			return true;
		}
		System.out.println("No puc fumar");
			return false;
	}
	
	
	//Getters and Setters and toString	
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
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getTobaccoPacket() {
		return tobaccoPacket;
	}

	public void setTobaccoPacket(int tobaccoPacket) {
		this.tobaccoPacket = tobaccoPacket;
	}

	//toString
	@Override
	public String toString() {
		return "Person Fields: (name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth + ", basicSalary="
				+ basicSalary + "money= " + money + "tobaccoPacket =" + tobaccoPacket + ")";
	}
	
	
	
	
	
	
}
