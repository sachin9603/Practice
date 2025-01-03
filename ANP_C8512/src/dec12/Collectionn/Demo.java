package dec12.Collectionn;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		int[] arr  = new int[10] ; //01 23456789
		
		// it is providing type safety 
		// data will on the index position  
		// index will start from 0 th 
		
		// suppose if you are declaring any arr and you not storing entire data inside array 
		
		//then remaing palce have default value  
		
		arr[0] = 12  ;
		arr[1] = 12  ;
		arr[2] = 12  ;
		//arr[13] = 14 ; /// Array index out of bond exception
		
		String [] arrr  = new String[5] ;
		
		
		System.out.println(Arrays.toString(arr));
		
		for(int uu  : arr) {
			System.out.println(uu);
		}
		for(String  uu  : arrr) {
			System.out.println(uu);
		}
		
		
		
		Student [] stArr  = new Student[5] ; // null null  null  null  null 
		
		stArr[0] = new Student() ;
		
		stArr[0].setMarks(12);
		stArr[0].setName("pawan");
		stArr[0].setRollno(1);
		
		stArr[1] = new Student(12 , "Gopal" , 2112) ;
		stArr[2] = new Student(12 , "Satish" , 2112) ;
		
		
		
		for (Student st  :stArr) {
			System.out.println(st);
		}
		
		
		
	}

}
