package may30;

import java.util.*;

//import java.lang.*;

public class Main1 {
	
	public static void main(String[] args) {
		
//		Wrapper classes:
//			Classes representation of primitive data types are called as Wrapper Classes.
//			Primitive Data Types : Wrapper Classes
//			byte : java.lang.Byte
//			short : java.lang.Short
//			int : java.lang.Integer
//			long : java.lang.Long
//			float : java.lang.Float
//			double : java.lang.Double
//			char : java.lang.Character
//			boolean : java.lang.Boolean
		
		int s  =  20  ;
	
		
		Integer fff  = 333  ; //sir ye Integer jis package se aaraha hi vo package kyu import nahi huva
		
		// is java is fully object oriented language 
		
		
		System.out.println(Byte.MIN_VALUE+"----->"+Byte.MAX_VALUE +"sizeee" + Byte.SIZE);
		
		
	//	In Java, type casting is a method or process that converts a data 
//		type into another data type in both ways manually and automatically.
//		The automatic conversion is done by the compiler and manual conversion 
//		performed by the programmer. In this section, we will discuss type casting
		//and its types with proper examples.
		
		//jab aap chote data type se bade data type mai convert karter hai toh ye kaam automativcally hoga
		// implicitly , wid
		
//
		
		byte twodigitvalue = 98 ;
		
		int vvv  = twodigitvalue ;
		
		System.out.println(vvv);
		
		
		byte aa  = 13  ;
		byte cc  = 15  ; // 128  
		
	//	byte add  = aa +cc  ;// java ye assume kar rahihai ki do byte ki value add hone par shayd badi vale banayegi 
		// so data type should be iinteger 
		
		
		//implicit yaa wideing 
		int add  = aa +cc  ;
		
		// hum phir se byte mai mai convery kar rhe hai 
		
		byte chotaDataTypeForAdd = (byte)add ;
		
		
		//System.out.println(add);
		
		long tt  = add ;
		
		double  dd  = 232323.322323 ; // ye hai sabse bada
		
		System.out.println(dd);
		
		long vvvv  = (long)dd  ;
		
		System.out.println(vvvv);
		
		
		int yy  = 87 ;
		byte tyt  = (byte)yy ;
	
		
		
		
		
		

		
	}

}
