package nov_14.collection;

public class MMMChild extends MM{

	
	
	String n  ;
	
	
	
	public MMMChild(String n) {
		super(n);
		//this.n = n;
	}



	public static void main(String[] args) {
		
		MMMChild p = new MMMChild("jk") ;
		
		
		
		MM refOfParent  = (MM)p ; // it is posibble but viseverse is no true it will throw a classcast exception 
		
		
		MM l  = new MM("purav") ;
		
		System.out.println("sachinnnnnnnnnnnnnnnnnnnnnn");
		
		
		MMMChild  refOfChild = (MMMChild)l ;
		
	}
}
