package personExample;

public class Displacement {
	
	String name = "";
	Location locInit;
	Location locFinish;
	MyDate date;
	
	
	public Displacement(String name, Location locInit, Location locFinish, MyDate date) {
		super();
		this.name = name;
		this.locInit = locInit;
		this.locFinish = locFinish;
		this.date = date;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Location getLocInit() {
		return locInit;
	}


	public void setLocInit(Location locInit) {
		this.locInit = locInit;
	}


	public Location getLocFinish() {
		return locFinish;
	}


	public void setLocFinish(Location locFinish) {
		this.locFinish = locFinish;
	}


	public MyDate getDate() {
		return date;
	}


	public void setDate(MyDate date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Displacement [name=" + name + ", location initial=" + locInit + ", location finish=" + locFinish + ", date=" + date
				+ "]";
	}
	
	
	
	
	
	

}
