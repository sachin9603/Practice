package sep4.Builder;

public class User {
	
	// i will give attribute in any sequence  but you need to give object 
	
	private  final String userId  ;
	private final String userName  ;
	private final String userEmail  ;
	
	
	private User(UserBuilder builder) {
		
		// they should be initialize 
		
		this.userId  = builder.userId ;
		this.userEmail  = builder.userEmail  ;
		this.userName = builder.userName  ;
		
				
		
		
	}
	
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	
	
	//inner Class to create a object // kind of jugaad  
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}



	static class UserBuilder{
		
		private   String userId  ;
		private  String userName  ;
		private  String userEmail  ;
		
		
		
		
		public UserBuilder() {
			
		}

		public UserBuilder setUserId(String userId) {
			
			this.userId = userId;
			
			return this ;
		}

		public UserBuilder setUserName(String userName) {
			
			this.userName = userName;
			return this ;
		}

		public UserBuilder setUserEmail(String userEmail) {
			
			this.userEmail = userEmail;
			
			return this ;
		}
		
	
		public User build() {
			User u  = new User(this) ;
			return u ;
		}
		
		
		
	}
	
	
	

}
