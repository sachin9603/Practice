package Demo3;

public class EmmployeeTest {

	public static void main(String[] args) {
		
	Employee ee =  new Employee() ;
	
      ee.setEmpId(4444); 
      ee.setEmpName("sachin");
      ee.setEmpDepartment("DeepTech");
      
     
//      
//      System.out.println(ee.getEmpDepartment());
//      System.out.println(ee.getEmpId());
//      System.out.println(ee.getEmpName());
      
      System.out.println(ee);
      
      
      Employee ee1 =  new Employee() ;
  	
      ee1.setEmpId(444); 
      ee1.setEmpName("kuber");
      ee1.setEmpDepartment("DeepTech");
      
     
//      
//      System.out.println(ee.getEmpDepartment());
//      System.out.println(ee.getEmpId());
//      System.out.println(ee.getEmpName());
      
      System.out.println(ee1.empCompnay);
      
      Employee ee2 =  new Employee() ;
  	
      ee2.setEmpId(4456); 
      ee2.setEmpName("ramCharan");
      ee2.setEmpDepartment("DeepTech");
      
     
//      
//      System.out.println(ee.getEmpDepartment());
//      System.out.println(ee.getEmpId());
//      System.out.println(ee.getEmpName());
      
      System.out.println(ee2);
      
      Employee ee3 =  new Employee() ;
  	
      ee3.setEmpId(000); 
      ee3.setEmpName("GyanSign");
      ee3.setEmpDepartment("SS");
      
     
//      
//      System.out.println(ee.getEmpDepartment());
//      System.out.println(ee.getEmpId());
//      System.out.println(ee.getEmpName());
      
      System.out.println(ee3.empCompnay);
      
      
      
     String cccc = Employee.empCompnay ;
     
      
      
      
      
		
	}
}
