package multiThreadingg.racecondition;

class Common{
	
	

	public  void fun1(String name){
		
		
		
		synchronized(this){//if a thread gets the class level lock of class A
			//then only it is allowed to execute following block
			System.out.println("do some more thing1");
	
		System.out.print("Welcome");
		try{
		Thread.sleep(1000);
		}
		catch(Exception ee){
		}
		
		System.out.println(name);
		
		}
	}
	
	
	
}