package AUG1.Consumer;

import java.util.function.Consumer;

public class ConsumerererImpl implements Consumer {

	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub
		System.out.println("mai aayi hu  ConsumerererImpl");
		System.out.println(t);
		
		
	}
	
	public static int supplierMethod() {
		return  99999 ;
	}

}
