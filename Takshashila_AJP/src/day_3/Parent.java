package day_3;

import day_1.Basic_info;

public class Parent {
	
	//Access Modifiers in Java --- public , private  , protected  ,default 
	
	// public ka matlab hai ki saare project mai access  --- package or sabhi mai  
	
	//private ----- vo sirf usi class mai  
	
	/// protected  ----- usi package mai ---- or yadi koi child hai dusare package mai then it can also acess 
	// default  ----same package mai  only 
	
	
	
	
	public static void main(String[] args) {
		
		Basic_info obj = new Basic_info()  ;
		String name  = obj.class_name		 ;
		String pass  = obj.Safe_password ;
		
		
		System.out.println(name);
		
	}

}
