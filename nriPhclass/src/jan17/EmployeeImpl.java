package jan17;

public class EmployeeImpl  implements EmployeeApp{
	
	// jab class kisi interface ko use karna chahti hai toh implements word use hota
	// interface mai jitani methods hai vo saari yaha par automatic implement hone k liye ide k through aa ajayegi 
	
/// https://localhost:8080/Employee
	@Override
	public String saveemployee() {
		// TODO Auto-generated method stub
		
		
		return "employee has been saved ";
	}

	@Override
	public String deleteEmployee() {
		// TODO Auto-generated method stub
		return "employee has been delete ";
	}

}
