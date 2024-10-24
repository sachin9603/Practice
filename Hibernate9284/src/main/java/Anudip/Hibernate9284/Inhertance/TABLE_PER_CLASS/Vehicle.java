package Anudip.Hibernate9284.Inhertance.TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy  = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

	@Id
	private int vehicleId;
	private String manufacturer;
	
	
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Vehicle(int vehicleId, String manufacturer) {
		super();
		this.vehicleId = vehicleId;
		this.manufacturer = manufacturer;
	}
	
	public Vehicle() {}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", manufacturer=" + manufacturer + "]";
	}  ;	
	
	
}
