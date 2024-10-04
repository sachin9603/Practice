package Emp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Emp.Exception.CarException;
import Emp.Exception.EmployeeException;
import Emp.model.Car;
import Emp.utility.ConnectioFactory;
import Emp.utility.QueryUtility;

public class CarDaoImpl implements CarDao{
	QueryUtility que  = new QueryUtility()  ;
	
	@Override
	public String registerCar(Car emp) throws CarException {
		
         String msg = null   ;
		
		try {
			Connection conn  = ConnectioFactory.getInstance().getConnection();
            PreparedStatement ppst  =  conn.prepareStatement(que.insertCar());
			ppst.setInt(1, emp.getCarId());
			ppst.setString(2, emp.getCarName());
			ppst.setDouble(3, emp.getEmpId());
			
			int  x  = ppst.executeUpdate() ;
			if(x> 0) {
				
				msg = "car inserted  successfully " ;
				
			}
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
		
		
	
	}

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
	

}
