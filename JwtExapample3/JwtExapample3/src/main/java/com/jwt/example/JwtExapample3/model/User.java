package com.jwt.example.JwtExapample3.model;

public class User {
	
 private String userId;
 private String name  ;
  
 private String email ;

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public User(String userId, String name, String email) {
	super();
	this.userId = userId;
	this.name = name;
	this.email = email;
}
 
 
    public User() {}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	} ;

 
	

}
