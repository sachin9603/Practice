package Emp.service;

import java.util.List;

import Emp.Dao.CarDao;
import Emp.Dao.CarDaoImpl;
import Emp.Exception.CarException;
import Emp.Exception.EmployeeException;
import Emp.model.Car;

public class CarServiceImpl implements CarService {

	CarDao  dao= new CarDaoImpl()  ;
	
	
	@Override
	public List<Car> getAllCar() throws CarException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> getAllCarBYEMPID(int id) throws EmployeeException, CarException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car deleteCarById(int id) throws CarException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerCar(Car emp) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String ans  = dao.registerCar(emp) ;
		
		return ans;
	}

}
