package Aug6.BuilderPattern;

public class UserClass {
	
	
	// id , name  , email
	private final String userName  ;
	private final String userid ;
	private final String emailId ;
	
	// now you can't create a object of these class
	
	private UserClass(UserBuilder  obj) {
		
		
		this.userName = obj.userName;
		this.userid  = obj.userid ;
		this.emailId  = obj.emailId ;
		
	}

	public String getUserName() {
		return userName;
	}

	public String getuserid() {
		return userid;
	}

	public String getEmailId() {
		return emailId;
	} ;
	
	
	
	// static class to create a object of this class  
	
	
	static class UserBuilder {
		
		private  String userName  ;
		private  String userid ;
		private  String emailId ;
		
		
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this ;
		}
		
		public UserBuilder setuserid(String userid) {
			this.userid = userid;
			return this ;
		}
		
		
		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this ;
		}
		
		
		 public  UserClass build() 
		 {
			 UserClass user  = new UserClass(this ) ;
			 
			 return user ;
			 
			 
		 }
		
		
		
		
	}

}
