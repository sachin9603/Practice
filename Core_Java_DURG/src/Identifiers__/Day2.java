package Identifiers__;

public class Day2 {
	
	public static void main(String[] args) {
		// % this operator will give reminder 
		System.out.println(89%3);// 89/3 k baad jo reminder aayega vahi % return karta
		// a++ --- post increment : --
		// ++a ---- pre increment ; --
//		int a = 5;
//		System.out.println(a++);
//		System.out.println(a);
//		
//		int a=5;
//		System.out.println(++a - ++a);
//
//		System.out.println(a);
//		
//		int a=5;         // 4     3    4    4    2   2     2     2   16
//		System.out.println((--a+--a)*(++a-a--)+(--a+a--)*(++a + a++));
//		
		
//		int a = 5;
//		     //  5      7     6    6
//		int b = a++ + ++a + --a + a--;
//		System.out.println(a + " " + b);
		
		int x = 10;
		int y = --x + x++ + ++x + x--;
		System.out.println(x + " " + y);
		
		
		int a = 7, b = 5;
		int c = a-- + b++ + --a + ++b;
		System.out.println(a + " " + b + " " + c);
		
		
		int m = 4, n = 2;
		      //4      1    6    1      5 
		int r = m++ * --n + ++m / n-- - --m;
		System.out.println(m + " " + n + " " + r);

		
		int u = 10  ;
		
		u  +=  15 ; // 25 u = u +15
		//   = , !=, <, >, <=, >=
		
		// && ------------ ||
		
		if(m == 5  || 6 == r) {
			System.out.println("may be equal ");
		}
		
		int k = 788; // it is not object 
		Integer aa = 90 ; // it is object 
		
		
		
		/// primitive data type ----- it do have primtive data ----  int, short , long , double, boolean , char , float , byte 
		// non primitive data type ------ all wrapper classes 
		
		//Classes representation of primitive data types are called as Wrapper Classes.
//		Primitive Data Types : Wrapper Classes
//		byte : java.lang.Byte
//		short : java.lang.Short
//		int : java.lang.Integer
//		long : java.lang.Long
//		float : java.lang.Float
//		double : java.lang.Double
//		char : java.lang.Character
//		boolean : java.lang.Boolean
		
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		String s = "45465" ;//4546510
		System.out.println(s+10);
		
		System.out.println(Integer.parseInt(s)+10);
		
		
		int g = 2147483647 ;
		
		/// wideing of data type 
		
		// byte ---> short ----> int ----> long
		
		byte ll = 8  ;
		short jh = ll ; /// implicit type
		
		short pp = 90  ;
		
		byte ks = (byte) pp ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		///if, if-else, switch
		
		if( ll >= 8  ) {
			System.out.println("yes i am running ");
		} else {
			System.out.println("I  running ");

		}

		
		if( ll >= 8  ) {
			System.out.println("yes i am running ");
		}else if (ll >= 8 ){
			System.out.println("I  running ");

		}else {
			System.out.println("I  running ");

		}

		
		
		
		
		
		
		
		
		
		
//
//		
		
		
	}

}
