package Emp.model;

public class Car {
	
	private int carId  ;
	private String carName  ;
	private int empId ;
	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public Car(int carId, String carName, int empId) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.empId = empId;
	}
	
	public Car() {
		super();
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", empId=" + empId + "]";
	}
	
	
	
	

}
