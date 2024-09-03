package aug30;

public class MutlipleCatch {
	
	
	public static void main(String[] args) {
		
		
		try {
			
			int i  =10/10  ;
			int[] arr  = new int [5];
			
			arr[3]	 = 12  ;	
			
			String age  = "18" ;
			System.out.println(age.charAt(1));
			}catch(ArithmeticException e ) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ar) {
			ar.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
