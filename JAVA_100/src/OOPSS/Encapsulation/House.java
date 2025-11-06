package OOPSS.Encapsulation;

///House has a Room 
public class House {
	
	private Room room ;
	
	// that is the example of composition 
	
	public House(int roomNumber) {
		room = new Room(roomNumber) ;
		
	}
	public void showInfo() {
		System.out.println("House information and room information");
		System.out.println("This house has a room and which numnber is "+ room.roomNumber);
	}
	
	public static void main(String[] args) {
		
		House h1 = new House(201);
		h1.showInfo();
		
		
	}
	
	
	
	
	
	

}
