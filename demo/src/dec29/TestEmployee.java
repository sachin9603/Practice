package dec29;

public class TestEmployee {

	public static void main(String[] args) {
		Developer d  = new Developer() ;
		
		QualityAnalyst  qa = new QualityAnalyst() ;
		d.saveCustomer();
		d.saveEmployee();
		Employee .shiftTiming() ;
		
		Employee.getAllEmployee();
		
		
		
		
		
		
	}
}
