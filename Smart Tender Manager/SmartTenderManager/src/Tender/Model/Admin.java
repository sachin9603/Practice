package Tender.Model;

public class Admin {
	
	private int AId;
	private String AName;
	private String AUsername;
	private String APassword;
	
	public int getAId() {
		return AId;
	}
	public void setAId(int aId) {
		AId = aId;
	}
	public String getAName() {
		return AName;
	}
	public void setAName(String aName) {
		AName = aName;
	}
	public String getAUsername() {
		return AUsername;
	}
	public void setAUsername(String aUsername) {
		AUsername = aUsername;
	}
	public String getAPassword() {
		return APassword;
	}
	public void setAPassword(String aPassword) {
		APassword = aPassword;
	}
	public Admin() {
	
	}
	public Admin(int aId, String aName, String aUsername, String aPassword) {
		super();
		AId = aId;
		AName = aName;
		AUsername = aUsername;
		APassword = aPassword;
	}
	@Override
	public String toString() {
		return "Admin [AId=" + AId + ", AName=" + AName + ", AUsername=" + AUsername + ", APassword=" + APassword + "]";
	}
	
	
	
	

}
