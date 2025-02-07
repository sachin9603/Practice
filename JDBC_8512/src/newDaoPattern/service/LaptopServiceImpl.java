package newDaoPattern.service;

import java.util.List;

import newDaoPattern.dao.LaptopDao;
import newDaoPattern.dao.LaptopDaoImpl;
import newDaoPattern.exxception.LaptopException;
import newDaoPattern.model.Laptop;

public class LaptopServiceImpl implements LaptopService {

	LaptopDao dao = new LaptopDaoImpl()  ;
	
	// it will be connected with client
	@Override
	public String saveLaptop(Laptop lappy) {
		
		
	String  s = 	dao.saveLaptop(lappy) ;
	
	return s;
	}

	@Override
	public Laptop getLaptopByID() throws LaptopException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Laptop> getAllLaptop() throws LaptopException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Laptop updateLaptop() throws LaptopException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteLaptop() throws LaptopException {
		// TODO Auto-generated method stub
		return null;
	}

}
