package com.Anudip.in.BasicTesting.serviceTesting;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {
	
	
	@Test
	public void LetMockListSizeMthod() {
		
		List listMock  = mock(List.class ) ;
		
		when(listMock.size()).thenReturn(2).thenReturn(3) ;
		
		assertEquals(2, listMock.size()) ;
	}
	
	
	@Test
	public void LetMockListgetMthod() {
		
		List listMock  = mock(List.class ) ;
		//Argument MAtcher 
		when(listMock.get(0)).thenReturn("sachin");
		when(listMock.get(anyInt())).thenReturn("sachin");
		
		assertEquals("sachin", listMock.get(0)) ;
	}
	
	@Test(expected = RuntimeException.class)
	public void LetMockListgetMthodAndThrowException() {
		
		List listMock  = mock(List.class ) ;
		//Argument MAtcher 
		when(listMock.get(0)).thenReturn("sachin");
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Somthing"));
		
		assertEquals("sachin", listMock.get(0)) ;
	}
	

}
