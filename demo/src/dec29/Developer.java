package dec29;

public class Developer implements Employee , Customers {

	// variable 
	int salary  = 70000 ;
	
	// paramenter constructor // jese hi ye banaya default jo jvm de rha tha vo gayab ho jayega 
	
	public Developer( int i ) {
		
		this.salary = i ;
		
		
		
		
	}
	//default 
	public Developer() {};
	
	
	@Override
	public void saveEmployee() {
		// TODO Auto-generated method stub
		
		System.out.println("employee saved ");
		
	}

	@Override
	public void findEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}
//	@Override
//	public void saveCustomer() {
//		// TODO Auto-generated method stub
//		
//		
//		
//	}
	public void saveCustomer() {
		// TODO Auto-generated method stub
		
	}

}
