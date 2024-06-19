package ReaderAndWriter;

import java.util.concurrent.Callable;

public class Dog  implements Callable<String>{

	@Override
	public String  call() throws Exception {
		// TODO Auto-generated method stub
		
		return "bow bow";
	}

}
