package jul5;

import java.util.Comparator;

public class CustomerImpl implements CustomerInterface , Comparator<CustomerImpl > {
	
	

	// why there is no ambiguity issue in java while using interface  but using class there  is ambiguity issue 
	// why interface allows static method and defaut method and are defalut methods in interface not abstract  ;
	// It can be used to achieve loose coupling. but what is loose coupling 
	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		
		System.out.println("yes customer is getting saveed ");
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
		System.out.println("yes it is getting deleted ");
		
	}

	@Override
	public int compare(CustomerImpl o1, CustomerImpl o2) {
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void givingService() {
		// TODO Auto-generated method stub
		
		System.out.println("giving service ");
		
	}
	
}
