package Tender.Model;

public class Bid {
	private int BidID;
	
	private int venderId ;
	
	private int FixedPrice;
	
	private Boolean status ;

	public int getBidID() {
		return BidID;
	}

	public void setBidID(int bidID) {
		BidID = bidID;
	}

	public int getVenderId() {
		return venderId;
	}

	public void setVenderId(int venderId) {
		this.venderId = venderId;
	}

	public int getFixedPrice() {
		return FixedPrice;
	}

	public void setFixedPrice(int fixedPrice) {
		FixedPrice = fixedPrice;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bid [BidID=" + BidID + ", venderId=" + venderId + ", FixedPrice=" + FixedPrice + ", status=" + status
				+ "]";
	}
	 public Bid() {
		// TODO Auto-generated constructor stub
	}

	public Bid(int bidID, int venderId, int fixedPrice, Boolean status) {
		super();
		BidID = bidID;
		this.venderId = venderId;
		FixedPrice = fixedPrice;
		this.status = status;
	}
	 
}
