package Tender.Model;

public class Vender {
	
	 private int Vid ;
	 private String Vname;
	 private String Username;
	 private String Password ;
	 
	public int getVid() {
		return Vid;
	}
	public void setVid(int vid) {
		Vid = vid;
	}
	public String getVname() {
		return Vname;
	}
	public void setVname(String vname) {
		Vname = vname;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	 public Vender() {
		// TODO Auto-generated constructor stub
	}
	public Vender(int vid, String vname, String username, String password) {
		super();
		Vid = vid;
		Vname = vname;
		Username = username;
		Password = password;
	}
	@Override
	public String toString() {
		return "Vender [Vid=" + Vid + ", Vname=" + Vname + ", Username=" + Username + ", Password=" + Password + "]";
	}
	 
	 

}
