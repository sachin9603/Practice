package sep4.Builder;

public class Test {
	
	
	public static void main(String[] args) {
		
		//.sutudy()
		
		User user1  = new User
				.UserBuilder()
			    .setUserId("9211")
				.setUserName("Rakesh ")
				
				.build();
		
		
		System.out.println(user1.getUserId());
		System.out.println(user1);
		
	}

}
