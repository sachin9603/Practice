package customerApp.Dao;

import java.util.List;

import customerApp.Exception.CustomerException;
import customerApp.Model.Customer;
import customerApp.Model.Orders;

public interface OrderDao {
    public String doingOrder(Orders c) ;
	
	public String deleteorders(int id ) ;
	
	public List<Orders> getAllordersbycusid(int id) ;
	
	public Orders highestValuedOrderOfParticularCustomer(int cusId) ;
	
	public double getAllordervalue(int cusid) ;
	
	public void customerWiseTotalOrder() ;
	
}
