package oct23.Excepti;

public class Demo {
	
	public void  finallyEx() {
		
    try {System.out.println("This is try blocK");
			System.out.println(100/0);
			return ;
		
			
		}catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println("Numbberrrrrrrrrrrrrrrrrrrrrrrrr");
			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("I am Rider");
			
			 
			
			
		}catch(Exception ll) {
			System.out.println(ll);
			System.out.println("I am final");
			
			
		}finally {
			System.out.println(" this will run every time   ");
			
		}
    System.out.println(" I am after the Fnally block ");
	
    return  ;
	}
	
	
	public static void main(String[] args) {
		
		
    Demo kkl  = new Demo() ;
    
    kkl.finallyEx();
    		
    
    System.out.println("WIll it run");
		
		
		
		
		
	}

}
