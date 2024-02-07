package com.masai.in.Masai.services;

public class calculatorService  {

	
	
	public static int addTwoNumber(int a  , int b) {
		return a+b;
		
	}
public static int multiplyTwoNumber(int a, int b) {
	
	return a*b ;
	
	}

public static double divideTwoNumber( int a , int b) {
	return a/b ;
	
}

public static int SumAnynumber(int ...numbers) {
	int s = 0 ; 
	
	for(int n :numbers) {
		s+=n  ;
		
	}
	
	return s  ;
	
}
}
