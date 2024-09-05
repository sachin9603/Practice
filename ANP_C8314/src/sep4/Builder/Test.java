package sep4.Builder;

import sep4.Builder.User.UserBuilder;

public class Test {
	
	
	public static void main(String[] args) {
		
		//.sutudy()
		
		User user1  = new User
				.UserBuilder().setUserName("Rakesh ")
				.setUserId("9211")
				.setUserEmail("Rakesh@gmail.com" )
				.build() ;
		
		
			
		
		System.out.println(user1.getUserId());
		System.out.println(user1);
		
	}

}
