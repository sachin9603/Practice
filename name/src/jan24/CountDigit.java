package jan24;

public class CountDigit {

	
	
	public static void main(String[] args) {
		
		int arr  []  = {0,2,1,2,1,2,0,0,0,0} ;
		
		int count1  = 0  ;
		int count0  = 0  ;
		int count2  = 0  ;
		
		
		for (int j  : arr) {
			if(j == 1) {
				count1++ ;
				
			}else if( j  == 0) {
				count0 ++;
				
			}else {
				count2++;
				
			}
			
		}
		
		System.out.println(count0+" "+ count1+" " +count2);
		
		
		/// arr  = 1, 4, 2, 10, 23, 3, 1, 0, 20  
		
		// ans is 36
		// k = 3  ; continues 3 number vo dhundo jinka sum sabse bada  hai 
		
		
		
	}
}
