package Stubs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Business.TodoBusinessImpl;

public class TodoSTestingWtihStub {
	
	
	@Test
	public void test() {
		
		TodoServiceStub cc =  new  TodoServiceStub () ;
		
		TodoBusinessImpl  B  = new TodoBusinessImpl(cc) ;// yaha mai businness mai fake class daal raha hu 
		
		
		List<String> ss  = B.retriveTodosRelatedToCollection("sdfsadf" ) ;
		
		Assert.assertEquals( 2, ss .size() );
		
		
	}
	

}
