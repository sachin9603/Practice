package nov5;

public class Test {

	public static void main(String[] args) {
		
		Customer.shift();
		Customer c = new CustomerImpl()  ;
		c.saveCustomer();
		c.updateCustomerDetails();
		int s  = c.age ;
		c.companyName();
		
		
		
		
	}
}
