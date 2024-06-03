package feb12;

public class Car {
	
	// naman  
	 
	
		
//	for(int i = s.length() -1 ; i>=0 ; i--) {
//			reverse = reverse + s.charAt(i) ;
//		}
//	
//	System.out.println(reverse);
//		if(s.equals(reverse)) {
//			//System.out.println("yeeeee");
//			return true ;
//		}
//		return false  ;
		
		
	
	public static void main(String[] args) {
		String ss  = "hi hello mom naman" ;
		
		String[] aarr = ss.split(" ");
		
		int max  =  0 ;
		
		String ans  = "" ;
		
		int tt  = 0  ;
		
		for(int i  =0 ;i<aarr.length ;i++ ) {
			
			int stringLength = aarr[i].length() -1 ;
			
			while(tt< stringLength) {
				if(aarr[i].charAt(tt) != aarr[i].charAt(stringLength)) {
				 
					
					break;
				}
				
			
				
			}
			
			
		}
		
		System.out.println(max);
		
		
		
	}

}
