package newDaoPattern.dao;

import java.util.List;

import newDaoPattern.exxception.LaptopException;
import newDaoPattern.model.Laptop;

public interface LaptopDao {
	
	
	public String saveLaptop( Laptop lappy ) ;
	
	public Laptop getLaptopByID () throws LaptopException ;
	
	public List<Laptop> getAllLaptop() throws LaptopException ;
	
	public Laptop updateLaptop() throws LaptopException ; 
	
	
	public String deleteLaptop() throws LaptopException ; 
	
	

	
	

}
