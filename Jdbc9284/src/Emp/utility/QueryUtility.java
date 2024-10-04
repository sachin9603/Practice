package Emp.utility;

public class QueryUtility {
	
	public String insertEmployee() {
		return "insert into Employee values(? , ? ,?)" ;
	}
	
	public String getAllEmp() {
		return "select * from Employee";
	}
	
	
	public String insertCar () {
		return "insert into car values (? ,?, ?) ";
	}
	

}
