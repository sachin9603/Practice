package CustomerAPP.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CustomerAPP.Dao.CustomerDao;
import CustomerAPP.Exception.CustomerException;
import CustomerAPP.model.Customer;
import CustomerAPP.util.Dao;
import CustomerAPP.util.QueryUtil;




public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String registerCustomer(Customer cus) throws CustomerException {
		// TODO Auto-generated method stub
		
		String  msg  = "data is not inserted " ;
		
		try(Connection con  = Dao.provideConnection() ) {
		//	String query   = "insert into customer(cName, cPassword, address) values (?,?,?)" ;
			PreparedStatement ps  = con.prepareStatement(QueryUtil.registerCustmr()) ;
			ps.setString(1,cus.getCName() );
			ps.setString(2,cus.getCPassword() );
			ps.setString(3,cus.getAddress() );
			
		int row  =	ps.executeUpdate() ;
		
		if (row >0) {
			msg = "You have been registered" ;
			
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> allCustomer = new ArrayList<>() ;
		
		try(Connection con  = Dao.provideConnection()) {
			
			PreparedStatement ps  = con.prepareStatement(QueryUtil.getallCustomer()) ;
			
			ResultSet result =  ps.executeQuery() ;
			
			while(result.next()) {
				
				int id  = result.getInt("Cid") ;
				String name  = result .getString("Cname");
				String password = result.getString("CPassword") ;
				
				String caddress = result.getString("address") ;
				
				allCustomer.add(new Customer(id,name,password,caddress)) ;
				
			}
			
		
			
			
//			// step no 5 
//			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allCustomer ;
		
	}
	// you have to implements these two methods 

	@Override
	public Customer updateCustomer(Customer cus, int C_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int c_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(int customerId, String password) throws CustomerException {
		// TODO Auto-generated method stub
	
		try(Connection con  = Dao.provideConnection() ) {
			PreparedStatement  psc  = con.prepareStatement("select Cid, Cpassword from customer where cId="+customerId ) ;
			
			ResultSet rs =psc.executeQuery() ;
			
			if (rs.next()) {
				String pass  =  rs.getString("Cpassword") ;
				if(pass.equals(password)){
					return true  ;
				}else {
					throw new CustomerException("your password is not correct ") ;
					
				}
			}
			throw new CustomerException("your are not exist into our data base ") ;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
