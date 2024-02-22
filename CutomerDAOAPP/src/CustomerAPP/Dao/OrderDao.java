package CustomerAPP.Dao;

import java.util.List;

import CustomerAPP.Exception.CustomerException;
import CustomerAPP.model.Orders;

public interface OrderDao {
	// suppose  I have to  order  someting  then i have to login first  then  order something 
	 
	public String doingOrder(Orders o) throws CustomerException ;
	
	//you have get list of all order related to that particular customer //
	//customer should not login again if he is already logged ing 
	
	public List<Orders> getallorderByID(int cusID) throws CustomerException ;
	
	
	
  
	
}
