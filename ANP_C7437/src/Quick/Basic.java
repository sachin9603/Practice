package Quick;

public class Basic {
	
 String sound  = "any sound " ; // instance varible 
 
 String studentname ;
 Integer s  = new Integer(3434); ;
 
 int s2  = 23  ;
 
 
 static String college_name  = "VIT" ; // static \
 
 
    void bark (){
		String dog = "bow bow " ; // local variable 
	}
	
    //parameterised cons 
	public Basic(String sound, String studentname) {
		
		this.sound = sound;
		this.studentname = studentname;
	}

	public Basic() {} ;
	





	public static void main(String[] args) {
		
		// jvm explicitly  provides you default constructor 
		// but if you will create a parametersised contructor then that defalut will be vanish(overload) 
		//in that case you to create a default one also 
		
		
		
		Basic b1  = new Basic("haha" , "karan"); // ek single sa obj  
		
		Basic b2  = new Basic("cry " , "vrasha");  
		
	System.out.println(b1.college_name);
		
		
		
		
	}
}
