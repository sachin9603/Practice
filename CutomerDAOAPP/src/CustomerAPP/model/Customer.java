package CustomerAPP.model;

public class Customer {

	private int  cId ; // C001 .,C002 , C003 .,C004 
	
	private String CName  ;
	
	private String CPassword ;
	
	private String address ;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public String getCPassword() {
		return CPassword;
	}

	public void setCPassword(String cPassword) {
		CPassword = cPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer(int cId, String cName, String cPassword, String address) {
		this.cId = cId;
		CName = cName;
		CPassword = cPassword;
		this.address = address;
	}
	
	
	public Customer(String cName, String cPassword, String address) {

		CName = cName;
		CPassword = cPassword;
		this.address = address;
	}

	public Customer () {}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", CName=" + CName + ", CPassword=" + CPassword + ", address=" + address + "]";
	} ;
	
	
	
}
