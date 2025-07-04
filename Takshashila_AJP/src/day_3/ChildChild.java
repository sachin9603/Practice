package day_3;

import day_1.Basic_info;
// when one class is extending another class then that clss become child of that another class 
//child class 
public class ChildChild extends  Basic_info{
	
	public static void main(String[] args) {
		
		ChildChild deva  = new ChildChild()  ;
		
		double  total_Dhan  = deva.total_property ;
		
		String s = deva.class_name ;
		System.out.println(total_Dhan);
		
		
		
		
	}

}
