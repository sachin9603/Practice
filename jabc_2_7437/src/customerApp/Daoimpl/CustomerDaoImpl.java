package customerApp.Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import customerApp.Dao.CustomerDao;
import customerApp.Exception.CustomerException;
import customerApp.Model.Customer;
import customerApp.util.Dao;
import customerApp.util.QueryUtil;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public String registercustomer(Customer c) throws CustomerException {
		// TODO Auto-generated method stub
		String msg  = "not inserted" ;
		
		try(Connection con = Dao.provideConnection()){
			
			PreparedStatement ps  = con.prepareStatement(QueryUtil.insertdata());
			ps.setInt(1, c.getCusId());
			ps.setString(2, c.getCusName());
			ps.setString(3, c.getCusPassword());
			ps.setString(4, c.getCusAddress());
			
			int row  = ps.executeUpdate() ;
			
		if(row>0) {
			msg  = "data get inserted";
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}

	@Override
	public String deleteCustomer(int id) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public Customer getcustomerById(int id) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

}
