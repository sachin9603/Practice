package feb8;

public class NewConnection implements Cloneable{
	
	private String ip  ;
	
	private String imporatnData ;
	

	public NewConnection(String ip, String imporatnData) {
		super();
		this.ip = ip;
		this.imporatnData = imporatnData;
	}
	
	
	public void loadveryveryImpData() {
		System.out.println("data is getting load ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.imporatnData  = "data load goya jo ki kaafi imp hai ";
		
	}

	@Override
	public String toString() {
		return "NewConnection [ip=" + ip + ", imporatnData=" + imporatnData + "]";
	}


	public NewConnection() {
		super();
	}



	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImporatnData() {
		return imporatnData;
	}

	public void setImporatnData(String imporatnData) {
		this.imporatnData = imporatnData;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	}
	
	public void settingFrequency() {
		System.out.println("it has been set");
	}
	
	

}
