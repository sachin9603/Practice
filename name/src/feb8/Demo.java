package feb8;

public class Demo {

	
	public static void main(String[] args) {
		System.out.println("creating object using prototype design ");
		
		
		NewConnection connection  = new NewConnection() ;
		
		connection.setIp("192.003.001.4.6");
		
		connection.loadveryveryImpData(); 
		
				
		System.out.println(connection.getClass());
		
		connection.settingFrequency();
		
		
		
		System.out.println(connection);
		
		try {
			NewConnection connection2 = (NewConnection) connection.clone();
			System.out.println(connection2);
			 connection2.setIp("45345.,23452334523");
			System.out.println(connection2.getClass());
			
			System.out.println(connection2);
			
			connection2.settingFrequency();
			
			connection2.loadveryveryImpData(); 
			
			

			
			NewConnection connection23 = (NewConnection) connection.clone();
			System.out.println(connection23);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	
		
	}
}
