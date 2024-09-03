package sep3;

public class Main {
	
	
	public void agecheker(int  age) throws  AgeException{
		
		if(age <18) {
			
		 throw new AgeException("you are not eligible for vote  ");
		}else {
			System.out.println("you are eligible ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Main  m  = new  Main() ;
		
		
			try {
				m.agecheker(17);
			} catch (AgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("normal flow");
		
		
		
	}

}
