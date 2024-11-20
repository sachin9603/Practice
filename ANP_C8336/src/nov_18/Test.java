
package nov_18;

public class Test {
	
	public static void main(String[] args) {
		
		Common c  = new Common()  ;
		Common c2 = new Common()  ;

		
		AA a  = new AA("RAM",c)  ;
		
		BB b  = new BB("Shyam",c2)  ;
		
		a.start();
		b.start();
		
	}

}
