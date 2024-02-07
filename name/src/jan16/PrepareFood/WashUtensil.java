package jan16.PrepareFood;

public class WashUtensil  implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0 ;i<=5 ; i++) {
			
			 System.out.println(" Utensil  is geeting washed"+ i);
			}	
		
		
		
	}

}
