package jul3;

public class Student {
	 //var agrs
    public static int add(int ...a){
        int num=0;
        System.out.println("Var-agrs");
        
        for (int c:a) {
            num += c;

        }
        return num  ;
    }
 
	public static int add(int a, int b){
	     System.out.println("Two parameters");
	
        int c = a+b;
   
        return c;


    }
    public static double add(double a,double b,double c){
    	 System.out.println("Using three parameters");
    
        double d  = a+b+c;
       
        return d;
    }
   

	public static void main(String[] args) {
		
		int a  = Student.add(12,12) ;
		System.out.println(a);
		
		
		int aa  = Student.add(12,12,12,324,43,5,54,2332,23) ;
		System.out.println(aa);
		
		
		double aaa  =  Student.add(12,12,12) ;
		System.out.println(aaa);
		
		
		
	}

}
