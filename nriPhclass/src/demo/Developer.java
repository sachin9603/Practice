package demo;
///////////// develper is a Employee

public class Developer extends Employee {

	private  String Address  ;
	
	
	private boolean haveLaptop ;
	
	
	private double Salary  ;
	


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public boolean isHaveLaptop() {
		return haveLaptop;
	}


	public void setHaveLaptop(boolean haveLaptop) {
		this.haveLaptop = haveLaptop;
	}


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}
	
	

	public Developer() {
	
	}


	public Developer(int empId, String empName, String empUserName ,String address, boolean haveLaptop, double salary) {
		super(empId, empName, empUserName);
	
		Address = address;
		this.haveLaptop = haveLaptop;
		Salary = salary;
	}


	public Developer(String address, boolean haveLaptop, double salary) {
	
		Address = address;
		this.haveLaptop = haveLaptop;
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Developer [Address=" + Address + ", haveLaptop=" + haveLaptop + ", Salary=" + Salary + ", EmpId="
				+ getEmpId() + ", EmpName=" + getEmpName() + ", EmpUserName =" + getEmpUserName()
				+ "]";
	}

// override ka use isaliye krate hai taki ye fix ho sake ki ye same method parent mai bhi hai 
	
	
	@Override 
	public void lunchKaTime() {
		System.out.println("Developer k lunch ka time hai 12:20 pm to 2:30 pm ");
		}
	
	

	
	
	
	
	
	
	
}
