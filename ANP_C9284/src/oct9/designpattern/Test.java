package oct9.designpattern;

public class Test {

	
	public static void main(String[] args) {
		
		Computer obj  = new Computer.ComputerBuilder()
				.setHDD("1tb")
				.setisGraphicalCardSlots(true)
				.build() ;
		
	System.out.println(obj.isGraphicalCardSlots());
		
	}
}
