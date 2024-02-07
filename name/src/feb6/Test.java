package feb6;

public class Test {
	
	
public static void main(String[] args) {
///
//      Employee d  = new Developer() ;
//     
//      d.salary() ;
	
	
	Employee ee  = EmployeeFactory.getEmoployeeObj("DeveLOPER") ;
	
	System.out.println(ee.salary());
	
	
	// singleTon design pattern 
	// ek esi class jiska ek hi obj banta ho bas 
	
	
	// expensive code jdbc  ka connection kara data base ke saath  pura crud karde  thb baand ho 
	
	
	//MehgiClass mg  = new MehgiClass() ;
//	MehgiClass mg2  = new MehgiClass() ;
//	MehgiClass mg3 = new MehgiClass() ;
//	MehgiClass mg4  = new MehgiClass() ;
	
	
	MehgiClass mg5   =  MehgiClass.getobjOFMehgiClass();
	MehgiClass mg3   =   MehgiClass.getobjOFMehgiClass();
	MehgiClass mg4   =  MehgiClass.getobjOFMehgiClass();
	
	System.out.println(mg5.hashCode());
	
	System.out.println(mg3.hashCode());
	System.out.println(mg4.hashCode());
	
	// lazy loading vo hoti hai jab aapka object tab hi create ho jaba aapko uski need 
	
	mehngi2 gg = mehngi2.getObjOFMenhgi2();
	
	mehngi2 gg2 = mehngi2.getObjOFMenhgi2();
	
	

	
	System.out.println(gg.hashCode());
	System.out.println(gg2.hashCode());

	
	
	
	
	
	
	
}

}
