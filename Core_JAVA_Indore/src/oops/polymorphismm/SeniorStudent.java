package oops.polymorphismm;

public class SeniorStudent  extends Student {
	
  @Override 
  public void study() {
		
		System.out.println("SeniorStudent are not doing study");
		
	}
 
    public void study_new() {
		
		System.out.println("Senio  new ");
		
	}
 




public static void main(String[] args) {
	Student s  = new SeniorStudent()  ;
	
	    s.study(); 
	    s.deciplin(); 
	  
}

}
