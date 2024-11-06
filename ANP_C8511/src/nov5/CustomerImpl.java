package nov5;

import java.io.Serializable;

public class CustomerImpl implements Customer{
	
	String   p  =" " ;
	

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		
		System.out.println("customer details are saved into data base successfully ");
		
	}

	@Override
	public void updateCustomerDetails() {
		// TODO Auto-generated method stub
		System.out.println("updated ...");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
