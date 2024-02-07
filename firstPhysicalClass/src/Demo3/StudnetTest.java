package Demo3;

public class StudnetTest {

	
	public static void main(String[] args) {
		/// ye kaam ho raha hai kiski help se parameter vaale 
		Student ss  = new Student(420 ,"Kaali" , 9211 ) ; /// constructor  default

	//	Student sseee  = new Student( "ramamamam", 5667676 , 9211 ) ;
		System.out.println(ss.id);
		System.out.println(ss.name);
        System.out.println(ss.rollNumber);
        
        ss.shiftTimeBatao();
        
        ss.shiftTimeBatao(10, 17);
        
        
//       char   gg =  ss.gradeBatao(450) ;
//       System.out.println("is baccche ka  grage  "+ gg);
//        
//        Student s1  = new Student();
//        
        
        

	}
}
