package Stubs;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.Anudip.in.TodoManagment.Service.TodosService;

import Business.TodoBusinessImpl;

@RunWith(MockitoJUnitRunner.class)
public class TodoSTestingWtihMock {
	
	@Mock
	TodosService  MockC ;
	
	
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl ;
	
	// BDD
	
    // 	given  100
	// when 6 sweater hasbeen goane 
	// then count should be updated  94
	
	@Test
	public void testingWithMock() {
		
	//TodoServiceStub cc =  new  TodoServiceStub () ;
		
		// real class naa create kar kar uski jagah ek mock class create karena hai 
		
		
	//	TodosService  MockC  = mock(TodosService.class) ;
		
 	when(MockC.retriveToDosList("Sachin")).thenReturn(Arrays.asList("Collection pp  " ,"revise Mokito " )) ;
//		when(MockC.retriveToDosList("Nulll")).thenReturn(Arrays.asList(" pp  " ,"revise  " )) ;
//		
//       System.out.println("Sachin ");
//		
		
		//TodoBusinessImpl  B  = new TodoBusinessImpl(MockC) ;
		
		List<String> ss  = todoBusinessImpl.retriveTodosRelatedToCollection("Sachin" ) ;
		
		Assert.assertEquals( 1,1 );
		
		
	}
	
	// can i mock predefinded classes 
	
	@Test
	public void testingMock() {
		//Assert.assertEquals( 2,2 );
		
		
		List  listMock  = mock(List.class) ;
		
		when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4) ;
		
		
		Assert.assertEquals( 2, listMock.size());
		Assert.assertEquals( 3, listMock.size());
		Assert.assertEquals( 4, listMock.size());
		Assert.assertEquals( 4, listMock.size());
	}
	
	@Test
	public void testGetMethod() {
		//Assert.assertEquals( 2,2 );
		 
		List  listMock  = mock(List.class) ;
		
		when(listMock.get(anyInt())).thenReturn("sachin");
		
		Assert.assertEquals( "sachin", listMock.get(25));
		System.out.println(listMock.get(1));
		
		System.out.println(listMock.size());
		
		
	//	trans --- what we will test during a trasaction 
		
//		List<String> arraylist  = new ArrayList<> () ;
//		arraylist.add("Rohit") ; //0
//		arraylist.add("rohamn") ; //1
//		arraylist.add("raju") ; //2
//		arraylist.add("sunil") ; //3
//		
//		System.out.println(arraylist.get(3));
		
		
		
	}

		
	

}
