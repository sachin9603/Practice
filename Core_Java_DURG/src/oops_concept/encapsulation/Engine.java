package oops_concept.encapsulation;

public class Engine {

	
	private String effiecency;
	private String fuel;
	
	
	
	public String getEffiecency() {
		return effiecency;
	}
	public void setEffiecency(String effiecency) {
		this.effiecency = effiecency;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Engine [effiecency=" + effiecency + ", fuel=" + fuel + "]";
	}
	
	public Engine() {}  ;
	
	
	public Engine(String effiecency, String fuel) {
		super();
		this.effiecency = effiecency;
		this.fuel = fuel;
	}
	
	
	
	
	
	
}
