package Aug6.DesignPattern;

import java.io.Serializable;

public class SingletonExample  implements Cloneable , Serializable{
	
	
	static SingletonExample  instance  = null ;
	
	private SingletonExample() throws Exception {
		if(instance != null) {
			throw new Exception("can't access");
		}
		}
	
	public static SingletonExample  getInstance() {
		
		if (instance  == null) {
			try {
				instance = new SingletonExample();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return instance ;
		}
		
		return instance  ;
	 }
	
	
	
	@Override 
	protected Object clone()throws CloneNotSupportedException{
			
		return super.clone();	
	}
	

	public  Object readResolve() {
		
		return  instance ;
		
	}
	
	
	
	

}
