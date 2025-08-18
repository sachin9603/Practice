package polymorph;

public class Demo {

	
	
	///poly----- multiple 
	// morph ---form ----
	
	
	/// overriding --- is a realtion (parent child )-- only implementation will be change 
	//---- overloading --- ek hi method hai or same clsss mai ,
	//number of parameter change ho jayege and it is called complitime polymorphism 
	
	
	public int cal( int a  , int b) {
		return a+b ;
		
	}
	public int cal( int a  , int b , int c) {
		return a+b+c ;
		
	}
	
	public double cal( double  a  , double  b , double  c) {
		return a+b+c ;
		
	}
	
	public static void main(String[] args) {
		
		Demo  obj = new Demo()  ;
		
	int n =	obj.cal(12, 12) ;
		
	System.out.println(n);
	
	
	int ans  = obj.cal(12, 12, 12);
	
	System.out.println(ans);
	
	
	
	double d  = obj.cal(12.1, 12.2,12.3) ;
	System.out.println(d);
	
	
	
	
	
	}
	
	
	
	
	
}
