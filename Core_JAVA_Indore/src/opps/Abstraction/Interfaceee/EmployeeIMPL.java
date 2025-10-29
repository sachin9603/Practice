package opps.Abstraction.Interfaceee;

import java.io.Serializable;

public class EmployeeIMPL implements Employee, Serializable {

	String g  = "sac" ;
	
	
	@Override
	public void saveDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("getting saveed into data base ");
		
	}

	@Override
	public void updateDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDetils() {
		// TODO Auto-generated method stub
		
	}
	

}
