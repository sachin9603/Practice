package Tender.Model;

public class Tender {
	
	private int TenderId ;
	private String TenderName;
	
	public int getTenderId() {
		return TenderId;
	}
	public void setTenderId(int tenderId) {
		TenderId = tenderId;
	}
	public String getTenderName() {
		return TenderName;
	}
	public void setTenderName(String tenderName) {
		TenderName = tenderName;
	}
	public Tender(int tenderId, String tenderName) {
		super();
		TenderId = tenderId;
		TenderName = tenderName;
	}
	public Tender() {
		super();
	}
	@Override
	public String toString() {
		return "Tender [TenderId=" + TenderId + ", TenderName=" + TenderName + "]";
	}
	
	
	

}
