package june5;

public class Right_angled_triagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1               
//		0 1
//		1 0 1
//		0 1 0 1   dono position ka sum yadi odd hai toh 0 likha hai or even par 1 
		
//		O O O O            00 01 02 03 
//		O O O O            10 11 12 13
//		O O O O  3*4  r*c  20 21 22 23 
//		
	//  0 1 2 3
//	0	a b c d 
//	1	e f g h 
//	2	i j k l    3*4 
		
		
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
		
		
		for( int  i =0 ;i<5 ;i++) {
			for(int j =0 ;j<=i ;j++) {
				
				if((i+j)%2== 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		

	}

}
