package customerApp.Dao;

import java.util.List;

import customerApp.Exception.CustomerException;
import customerApp.Model.Customer;

public interface CustomerDao {
	
	public String registercustomer(Customer c)  throws CustomerException;
	
	public String deleteCustomer(int id )throws CustomerException ;
	
	public String updateCustomer(Customer c ) ;
	
	public List<Customer> getAllCustomer() ;
	
	public Customer getcustomerById(int id)throws CustomerException;
	
}
