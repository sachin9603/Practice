package JDBC;

public class Password {
	

//		User Registration with WeakPasswordException
//		Task:
//		Create a custom exception class WeakPasswordException.
//		Write a UserRegistration class that checks the strength of a password. If the password does not meet certain criteria (e.g., at least 8 characters, contains a number and a special character), throw the custom exception.
//		Test the class with both valid and invalid passwords.
//		These questions will help students get hands-on experience with creating, throwing, and handling custom exceptions in Java.
	    public void registerUser(String username, String password) throws WeakPasswordException {
	    	
	        if (isValidPassword(password) == false ) {
	            throw new WeakPasswordException("Password is too weak. It must be at least 8 characters long, " +
	                    "contain at least one number, and one special character.");
	        }
	        System.out.println("User " + username + " registered successfully!");
	    }

	    private boolean isValidPassword(String password) {
	        if (password == null || password.length() < 8) {
	            return false;
	        }

	        boolean hasDigit = false;
	        boolean hasSpecialChar = false;
	        String specialCharacters = "!@#$%^&*(),.?\":{}|<>";
// sachin@12345435234
	        for (char ch : password.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                hasDigit = true;
	            } else if (specialCharacters.indexOf(ch) != -1) {
	                hasSpecialChar = true;
	            }

	            // If both conditions are met, we can return true early
	            if (hasDigit && hasSpecialChar) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	    	Password registration = new Password();

	        // Test Cases
	        try {
	            registration.registerUser("Alice", "password123");
	        } catch (WeakPasswordException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            registration.registerUser("Bob", "Pass@123");
	        } catch (WeakPasswordException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	

