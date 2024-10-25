
package oct16.hasARelation;
 //Employee has a Address
public class Employee {
	
	int id    ;
	String name  ;
	Address address ;
	
	
	public Employee(int id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}

  
	
	
	
  public void maiHuMethod() {
	System.out.println("method      /////////////////////");  
  }
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	} ;
}
