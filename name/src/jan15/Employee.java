package jan15;

import java.util.Objects;

public class Employee {
	
	 private int empId ;
	 private String empPassword ;
	 
	 private Addressss  adress ;
	 
	 
	 
	 
	 
	 
	 public void sabhiKiShift() {
		 System.out.println("Timing is fix 10 to 7 ");
		 
	 }
	 
	 
	 
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empPassword=" + empPassword + ", adress=" + adress + "]";
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpPassword() {
		return empPassword;
	}



	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}



	public Addressss getAdress() {
		return adress;
	}



	public void setAdress(Addressss adress) {
		this.adress = adress;
	}



	public Employee(int empId, String empPassword, Addressss adress) {
		super();
		this.empId = empId;
		this.empPassword = empPassword;
		this.adress = adress;
	}



	public Employee() {} ;
	 

}
