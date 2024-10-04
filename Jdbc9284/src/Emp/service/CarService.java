package Emp.service;

import java.util.List;

import Emp.Exception.CarException;
import Emp.Exception.EmployeeException;
import Emp.model.Car;

public interface CarService {
	

    public String registerCar(Car emp) throws EmployeeException  ;
	
	public List<Car> getAllCar() throws CarException ;
	
	public  List<Car> getAllCarBYEMPID(int id) throws EmployeeException , CarException ;
	

	
	public Car deleteCarById(int id)  throws CarException ; 

}
