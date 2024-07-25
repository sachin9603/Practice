package com.anudip.JUnitTest;

public class Service {
	
	
	public static int doCalculation(int a, int b) {
		int  c  = a+ b  ;
		return c  ;
		
	}
	
	
	public static int productTwoNumber(int a  , int b) 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a*b  ;
	}
	
	
	public static int divideTwoNumber(int a  , int b) {
		return a/b  ;
		
	}
	
	public static int sumAnyNumber(int ...num) {
		int ans  = 0  ;
		for(int a :num) {
			ans  += a  ;
		}
		return ans  ;
	}
	

}
