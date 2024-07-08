package jul5;

public class Demo22 {
	
	
	public static void main(String[] args) {
		
		Student [] arr = new Student[5];
		
		
		Address add  = new Address() ;
		add.setCity("Bhopal");
		add.setPincode("232323");
		add.setState("MP");
		
		
		Student  s1  = new Student();
		
		s1.setId(12 );
		
		s1.setName("Harilal");
		
		s1.setAdd(add);
		
		arr[0] = s1 ;
		
		

		Student  s2  = new Student(90  ,"David" , new Address("Surat", "Gj" ,"232323"));
		
		arr[1] = s2 ;
		
Student  s22  = new Student(90  ,"Ram" , new Address("Surat", "Gj" ,"232323"));
		
		arr[2] = s22 ;
		
Student  s3 = new Student(90  ,"Shishupal" , new Address("Surat", "Gj" ,"232323"));
	

   // s3.setAdd();
		arr[3] = s3 ;
		
		
		
Student  s4  = new Student(90  ,"Lakhan" , new Address("Surat", "Gj" ,"232323"));
		
   s4.getAdd().setCity("Vadodra"); 
   
     


		arr[4] = s4 ;
	
		
		
		
		for (Student ff : arr) {
			System.out.println(ff);
		}
		
		
		
				
 		
	}

}
