package jan29;

import java.io.IOException;

import java.util.Scanner;

public class Exceptionnn {
	
	
	///  vikas sr 
	//7869671906  adhar , 10 12  graduation , mobile , email  ,photo 
	
	
	public static int multiply() throws Exception {
		Scanner sc  = new Scanner(System.in) ;
		int s = sc.nextInt() ;
		
		int j  = sc.nextInt() ;
		
		int ans  = s*j  ;
		return ans ; 
		}
	
	
	public static void main(String[] args) {
		// some runtime exceptions 
		int yourAns;
		try {
			yourAns = multiply();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
