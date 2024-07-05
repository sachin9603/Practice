package june21;

import java.util.Scanner;

import jul1.Demo;

public class Main extends Demo  {
	
	public static void main(String[] args) { //main+ctrl+space
		Demo s = new Demo() ; 
		Main mmm  = new Main() ;
		
	System.out.println(	mmm.id);
		
		System.out.println("enter your age ");
		
		Scanner sc  = new Scanner(System.in) ;
		
		int age  = sc.nextInt() ;
		
		System.out.println(age>=18);///
		
		if(age>=18) {
			System.out.println("you can vote ");
		}else if(age<18 && age > 5){
			
			System.out.println(" only focus on your study");
			
		}else {
			System.out.println("you should stay in your home ");
		}
		
		
	}

}
