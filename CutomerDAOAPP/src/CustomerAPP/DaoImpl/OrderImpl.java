package CustomerAPP.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util .* ;


import CustomerAPP.Dao.OrderDao;
import CustomerAPP.Exception.CustomerException;
import CustomerAPP.Usecase.CustomerStuff;
import CustomerAPP.model.Customer;
import CustomerAPP.model.Orders;
import CustomerAPP.util.Dao;
import CustomerAPP.util.QueryUtil;

public class OrderImpl implements OrderDao{
	boolean logindone = false  ;
	
	@Override
	public String doingOrder(Orders o) throws CustomerException {
		// TODO Auto-generated method stub
		System.out.println("you have to login first ");
		System.out.println("enter your customer id ");
		int id  = CustomerStuff.sc.nextInt() ;
		
		System.out.println("Enter your customer name ");
		
		String password  = CustomerStuff.sc.next() ;
		
		
		boolean logindone  = 	CustomerStuff.dao.login(id, password);
		
		if(logindone) {
			try(Connection con = Dao.provideConnection() ){
				
				PreparedStatement ps  = con.prepareStatement(QueryUtil.doingOrder()) ;
				
				ps.setString(1, o.getOrderName());
				ps.setInt(2 , o.getOrderValue()) ;
				ps.setInt(3, id);
				
				int  row = ps.executeUpdate();
				if (row > 0 ) {
					System.out.println("ok  ");
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		return "your order has been done  ";
	}

	@Override
	public List<Orders> getallorderByID(int cusID) throws CustomerException {
		// TODO Auto-generated method stub
		List<Orders>  all_order = new ArrayList<>() ;
		if(logindone == false ) {
			System.out.println("you have to login first ");
			System.out.println("enter your customer id ");
			int id  = CustomerStuff.sc.nextInt() ;
			
			System.out.println("Enter your customer name ");
			
			String password  = CustomerStuff.sc.next() ;
			 
			boolean logindone  = 	CustomerStuff.dao.login(id, password);
		}
		
		try(Connection con = Dao.provideConnection() ){
			
			PreparedStatement ps  = con.prepareStatement("select * from orders where Customer_id = "+cusID ) ;
		
            ResultSet result =  ps.executeQuery() ;
			
			while(result.next()) {
					String name  = result .getString("oname");
				int value  = result.getInt("order_value") ;
				
				all_order.add(new Orders(name  ,value )) ;
				
	         }
			return all_order ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
