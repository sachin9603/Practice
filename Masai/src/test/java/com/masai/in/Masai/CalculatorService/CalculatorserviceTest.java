package com.masai.in.Masai.CalculatorService;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.masai.in.Masai.services.calculatorService;

public class CalculatorserviceTest {
	
	
	//Test or Test(timeout =3000) or yadi ye thread Thred.sleep(3000)  toh fail ho jaayega
	 
	//BeforeClass 
	//AfterClass
	//Before
	//After
	
	

//saare test case se pehle 	// @BeforeClass
	@BeforeClass
	public static void init(){
		System.out.println("Before all test cases :" );
		//System.out.println("started Test : "+ new Date());
	}
	
	
	// test method of addTwonumbers
	
	@Test
	
	public void addTwoNumbersTest() {
		
		int r = calculatorService.addTwoNumber(12, 40);
		
		//actual result 
		// ecpected result 
		int expected   = 52  ;
		
		Assert.assertEquals(expected, r);
		
	}
	@Before // executes 
	public void beforeEach() {
		
		System.out.println("before each ");
	}
	
	@Test
	public void sumAnyNumberTest() {
		int res = calculatorService.SumAnynumber(2,4,3,2) ;
		int expectedResult  = 11  ;
		Assert.assertEquals(expectedResult, res);
	  }
	
	// saare test k baad
	
	@AfterClass
	public static void Cleanup() {
		System.out.println("before alll ");
	}
}
