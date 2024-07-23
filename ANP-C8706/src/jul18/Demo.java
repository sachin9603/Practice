package jul18;

import java.util.Comparator;

public class Demo  implements Comparator<Demo>{
	
	public static void main(String[] args) {
		
		
   Box <String>  dd  = new Box<String>("sasd") ;
   
  
		
		
		System.out.println(dd.getValue());
		
	}

	@Override
	public int compare(Demo o1, Demo o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
