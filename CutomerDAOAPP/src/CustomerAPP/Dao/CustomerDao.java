package CustomerAPP.Dao;

import java.util.List;

import CustomerAPP.Exception.CustomerException;
import CustomerAPP.model.Customer;

public interface CustomerDao {

	public  String registerCustomer(Customer cus) throws CustomerException ;
	
	public boolean login(int customerId  , String password )throws CustomerException ;
	
	public List<Customer> getAllCustomer();
	
	public Customer updateCustomer(Customer cus  , int C_id) ;
	
	public void deleteCustomer(int c_id) ;
	
	
}
