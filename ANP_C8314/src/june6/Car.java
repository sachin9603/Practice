package june6;

public class Car extends Vehicle {

	int carnumber  ;

	public Car(String vehNumber, String vehModel, double vehPrice, int carnumber) {
		super(vehNumber, vehModel, vehPrice);
		this.carnumber = carnumber;
	}
	
	
	public static void main(String[] args) {
		Vehicle v  = new Car("@332"  ,"22323" ,343434 ,323232);
	}
	
}
