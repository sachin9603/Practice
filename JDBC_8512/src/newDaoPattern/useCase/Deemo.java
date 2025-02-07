package newDaoPattern.useCase;

import newDaoPattern.model.Laptop;
import newDaoPattern.service.LaptopService;
import newDaoPattern.service.LaptopServiceImpl;

public class Deemo {

	
	public static void main(String[] args) {
		
	
		LaptopService service  = new LaptopServiceImpl()  ;
		
		Laptop la = new Laptop(1233  , "as313sass" , "DELL")  ;
		
		
		String s  = service.saveLaptop(la) ;
		
		System.out.println(s);
		
		
	/// Demo  ---- SERVICE  --- serviceImpl  ---dap --- Dao impl 	
		                        //                            |-----Connection 
		
	}
}
