package com.anudip.JUnitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ServiceTest {
	
	
	@BeforeClass  
	public static void beforeEach() {
		System.out.println(" before all test Cases  .....");
		System.out.println("started Test"  );
	}
	
	
	@AfterClass  
	public static void AfterEach() {
		System.out.println(" After all test Cases  .....");
		System.out.println("end Test"  );
	}
	
	
	   @Before  
	    public void setUp() throws Exception {  
	        System.out.println("before har ek k pehle ");  
	    }  
	   @Ignore
	   public void executionIgnored() {
	   System.out.println("@Ignore: This execution is ignored");
	   }
	   

   @Ignore
	public void doCalculationTest() {
	   
	   int actualresult =  Service.doCalculation(12, 12) ;
	   
	   int expect_result  = 24  ;
	   
	   Assert.assertEquals(expect_result, actualresult ); 
	
	 }
   
   @Test
   public void productOfTwoNumber() {
	   int act  = Service.productTwoNumber(12, 12) ;
	   int ext = 144  ;
	   Assert.assertEquals(ext, act );
   }
   
   
   @After  
   public void tearDown() throws Exception {  
       System.out.println("after");  
   }  
   

   @Test
   public void sumAnyTwoNumber() {
	   
	   int act  = Service.sumAnyNumber(1,2,3,4,5) ;
	   
	   int ext  = 15  ;
	   
	   Assert.assertEquals(ext, act);
	   
   }
   
   
   
   
}
