package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CustomerAPP.Exception.CustomerException;
import CustomerAPP.util.Dao;

public class LoginCustomer {
	
	public static boolean login(int customerId, String password) throws CustomerException {
		// TODO Auto-generated method stub
	boolean ans   = false ;
	
	System.out.println(customerId + "    "+password);
		try(Connection con  = Dao.provideConnection() ) {
			PreparedStatement  psc  = con.prepareStatement("select Cid, Cpassword from customer where cId="+customerId ) ;
			System.out.println("yes uyes yesd dlhcasdljh");
			ResultSet rs =psc.executeQuery() ;
		//	int  row  = 
			if (rs.next()) {
				String pass  =  rs.getString("Cpassword") ;
				if(pass.equals(password)){
					ans  = true  ;
					//return ans  ;
				}else {
					throw new CustomerException("your password is not correct ") ;
				}
			}else {
				throw new CustomerException("your are not exist into our data base ") ;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return ans ;
	
	}
}
