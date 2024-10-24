package Anudip.Hibernate9284.Inhertance.TABLE_PER_CLASS;

import javax.persistence.Entity;

@Entity

public class Car extends Vehicle {
	
	private String carCompay  ;

	public String getCarCompay() {
		return carCompay;
	}

	public void setCarCompay(String carCompay) {
		this.carCompay = carCompay;
	}

	public Car(String carCompay) {
		super();
		this.carCompay = carCompay;
	}
	
	public Car() {}

	@Override
	public String toString() {
		return "Car [carCompay=" + carCompay + ", getCarCompay()=" + getCarCompay() + ", getVehicleId()="
				+ getVehicleId() + ", getManufacturer()=" + getManufacturer() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	

}
