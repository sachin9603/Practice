package oct14.oopss;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		
		Student   s  = new Student() ; // ye jo obj ban raha hai ye ban rha hai constructor ki help  (Default)
		
		s.sname  = "Shushant" ;
		s.sid = 90  ;
		s.email  = "sus@gmail.com" ;
		s.password = "ppp@123" ;
		
		s.dispaly();
		
		Student kk  = new Student (900  , "kanika" , "Kanka@999" , "kanika@gmail.com") ;
		kk.dispaly();
		
		
		Student  ll  = new Student("Ravan" , "Lanka@0000" , "Ravan@gmail.com")  ;
		
		ll.dispaly();
		
		Student  o  = new Student()  ; // explicitly  nothing but internally object return karat hai and you need to hanldle that obj  
		
		int ans = ll.calculate(89  , 78) ;
		
		System.out.println(ans);
		
		
		
		
		
	}

}
