package jan15;

public class Developer extends Employee {
	
	private double  salary ;
	
	private  String Address ;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Developer [salary=" + salary + ", Address=" + Address + ", EmpId=" + getEmpId()
				+ ", EmpPassword=" + getEmpPassword()   + "]";
	}

//	public Developer(int empId, String empPassword , double s  , String address) {
//		super(empId, empPassword);// ye bhi tabhi kaam kar paa rahi hai jab parent class mai esa construtor ho jo do argument le rhaha ho 
//		
//		// TODO Auto-generated constructor stub
//		this.salary = s  ;
//		this.Address = address ;
//		
//	}

	public Developer(double salary, String address) {
		super();
		this.salary = salary;
		Address = address;
	}

//	public Developer(int empId, String empPassword , double salary, String address) {
//		super(empId, empPassword);
//		// TODO Auto-generated constructor stub
//		this.salary = salary;
//		Address = address;
//		
//	}

//	public Developer() {} ;
	
	@Override
	 public void sabhiKiShift() {
		 System.out.println("mai hi developer se ");
		 System.out.println("Timing is fix 10 to 7 ");
		 
	 }
	 
	
	
	

}
