package feb7;

import feb6.Student;

public class Basic {

	
	
	public static void main(String[] args) {
		
	
		
		// access modifiers  
		
		///  4 takreeke k access modifiers hai  
		// private , public ,default , protected 
		
		// private -> sierf class mai access karpoge 
		
		// public  -> pure project me access  , saree package mai  
		
		// default hai toh  ---- with in package only 
		
		
		// protected ---- >same package mai or yadi package mai acces karnahai toh vo `
		
		//protected int Rollnumber ; // yadi dusare package mai access karna hai toh vo class iski child class hona chahiye
		
		
		
		Student232  s  = new Student232() ; // jav abhi obj banatahai vo obj humesha contrutor ki help banat hai 
		
		s.setStudentId(232323);
				s.setMarks(500); 
				s.setStudentName("kalicharan "); 
				
				

		
		System.out.println(s.getStudentId());
		System.out.println(s.getMarks());
		System.out.println(s.getStudentName());
		
		
		Student232 ss = new Student232(9211  , "devkarn" , 400) ;
		
		
		System.out.println(ss);
		
		
		
		System.out.println(" employee ka kaam shuru") ;
		
		
		
		
		FrontEnd sa = new FrontEnd() ;
		
		sa.id = 56565 ;
		sa.name  = "raja " ;
		
	int ans =	sa.add(12, 13) ;
	System.out.println(ans);
		
	int ans1 =	sa.add(12, 13 , 45) ;
	System.out.println(ans1);
		
	
	
		
		
		System.out.println(sa.salary());
		
		
		Employee sap = new Fullstack() ;
		
		sap.id = 56565 ;
		sap.name  = "raja babu " ;
		System.out.println(sap.salary());
		
		
		
		
		
		
		
	}
	
}
