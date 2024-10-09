package oct9.designpattern;

// builder design pattern 
public class Computer {

	// parameters
	private String HDD ;
	
	private String Ram  ;
	
	
	// optinal parameter 
	
	private boolean isGraphicalCardSlots ;
	private boolean webcamWorking  ;
	
	
	public String getHDD() {
		return HDD;
	}
	public void setHDD(String hDD) {
		HDD = hDD;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public boolean isGraphicalCardSlots() {
		return isGraphicalCardSlots;
	}
	public void setGraphicalCardSlots(boolean isGraphicalCardSlots) {
		this.isGraphicalCardSlots = isGraphicalCardSlots;
	}
	public boolean isWebcamWorking() {
		return webcamWorking;
	}
	public void setWebcamWorking(boolean webcamWorking) {
		this.webcamWorking = webcamWorking;
	}
	
	
	// a constructor
	private  Computer(ComputerBuilder  builder ) {
		
		this.HDD  = builder.HDD ;
		this.Ram = builder.Ram ;
		this.isGraphicalCardSlots  = builder.isGraphicalCardSlots ;
		this.webcamWorking = builder.webcamWorking;
		
		
	}
	
	
	/// BuilderClass
	public static class ComputerBuilder{
		
		// parameters
		private String HDD ;
		
		private String Ram  ;
		
		
		// optinal parameter 
		
		private boolean isGraphicalCardSlots ;
		private boolean webcamWorking  ;
		
		
		public ComputerBuilder setHDD(String hdd) {
			this.HDD  = hdd  ;
			return this ;
			
		}
		
		public ComputerBuilder setRam(String Ram) {
			
			this.Ram  = Ram  ;
			return this ;
			
		}
		
       public ComputerBuilder setisGraphicalCardSlots(boolean tt) {
			
			this.isGraphicalCardSlots  = tt  ;
			
			return this ;
			
		}
			
       public ComputerBuilder setwebcamWorking(boolean kk) {
			
			this.webcamWorking  = kk  ;
			return this ;
			
		}
       
       
       public Computer build() {
    	   
    	   
    	   return new Computer(this) ;
    	   
       }
       
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
