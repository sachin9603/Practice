package jul5;

public class ChildOfClass extends Class {

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		ChildOfClass bb = new ChildOfClass() ;
		
		bb.saveCustomer();
		bb.deleteCustomer(); 
		bb.givingService();
	}
	

}
