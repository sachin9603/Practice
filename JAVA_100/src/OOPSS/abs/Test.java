package OOPSS.abs;

public class Test {
	
	public static void main(String[] args) {
		
		Bank obj = new BankImpl();
		
		obj.saveDetails();
		obj.bankLogo();
		
		//Bank obj2  = new Bank() ;
		
		Boi branch1 = new Boi() ;
		
		Employee e  = new EmployeeImpl() ;
		
		e.saveEmployee();
		System.out.println("doneee");
		e.updateEmployee();
		Employee.companyName() ;
		//Employee.deletDetails() ;
		int s = Employee.salary;
		System.out.println(s);
		
		
		
		
		
		
		
		
	}

}
