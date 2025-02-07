package newDaoPattern.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import newDaoPattern.exxception.LaptopException;
import newDaoPattern.model.Laptop;
import newDaoPattern.utility.Dao;

public class LaptopDaoImpl implements LaptopDao {

	@Override
	public String saveLaptop(Laptop lappy) {
		// TODO Auto-generated method stub
		
		//connection banaya 
		String a = null  ;
		
		String query = "insert into Laptop (id , model , brand) Values (?, ? ,?)" ;
		
		try {

			Connection c  = Dao.getDao().getConnection() ;
			
			PreparedStatement ppsmt  = c.prepareStatement(query) ;
			
			ppsmt.setInt(1, lappy.getLaptopId() );
			ppsmt.setString(2, lappy.getLaptopModel());
			ppsmt.setString(3, lappy.getLaptopBrand());
			
			int ans  =  ppsmt.executeUpdate() ;
			
			if (ans>0 ){
				a  = "laptop has been saved" ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return a;
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
