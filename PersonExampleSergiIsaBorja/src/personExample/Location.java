package personExample;

public class Location {
	
	public String name;
	public int altitude;
	public int latitude;
	
	
	public Location(String name, int altitude, int latitude) {
	
		this.name = name;
		this.altitude = altitude;
		this.latitude = latitude;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAltitude() {
		return altitude;
	}


	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}


	public int getLatitude() {
		return latitude;
	}


	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}


	@Override
	public String toString() {
		return "Location (name=" + name + ", altitude=" + altitude + ", latitude=" + latitude + ")";
	}
	
	
	
}
