package pack_03;

/// this is called encapsulation  
// this java bean 
// pojo --- > plain old java object 
 	 	
public class Department {
	
  private int departmentId ;
	
  private String departmentName ;
	 
  private  String companyName   ;

public Department(int dep, String departmentName, String companyName) {
	
	// this word refers instance of same class
	this.departmentId = dep;
	this.departmentName = departmentName;
	this.companyName = companyName;
} 
  
 


  
   public Department() {}





public int getDepartmentId() {
	return departmentId;
}





public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}





public String getDepartmentName() {
	return departmentName;
}





public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}





public String getCompanyName() {
	return companyName;
}





public void setCompanyName(String companyName) {
	this.companyName = companyName;
}




public String toString() {
	return "Department [department ki Id=" + departmentId+100 + ", department ka Name=" + departmentName + ", companyName="
			+ companyName + "]";
} ;
   


	
}
