package CustomerAPP.Dao;

import java.util.List;

import CustomerAPP.Exception.CustomerException;
import CustomerAPP.model.Customer;

public interface CustomerDao {

	public  String registerCustomer(Customer cus) throws CustomerException ; // create
	
	//public boolean login(int customerId  , String password )throws CustomerException ;
	
	public List<Customer> getAllCustomer();//read
	
	public Customer updateCustomer(Customer cus  , int C_id) ; // update 
	
	public void deleteCustomer(int c_id) ; // detele 
	
	
}
