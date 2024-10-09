package oct9.interfaceLoosecoupling;

public class Car {
	
	//Angine simpsonRottaory ;
	//Electricmotor ;
	
	
	Engine  eee ;
	
	
	public Car(Engine o) {
		
		eee  =  o  ;
		o.startEngine() ;
		
		System.out.println("yes it ready to rock ");
		
	}
	
	
	public static void main(String[] args) {
		
		 Engine ele = new Motor()  ;
		 
		 Engine ele2  = new Petrol () ;
		 
		 
		
		Car  a  = new Car(ele) ;  //electric
		
		Car a2  = new Car(ele2) ; // 
		
	
		
		
		
		
		
	}
	
	

}
