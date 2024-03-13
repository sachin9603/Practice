package customerApp.Model;

public class Orders {

	private int orderId  ;
	
	private String ordername  ;
	
	private double ordervalue ;
	
	private int cusid  ;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public double getOrdervalue() {
		return ordervalue;
	}

	public void setOrdervalue(double ordervalue) {
		this.ordervalue = ordervalue;
	}

	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public Orders() {} ;
	
	public Orders( String ordername, double ordervalue, int cusid) {
	
		this.ordername = ordername;
		this.ordervalue = ordervalue;
		this.cusid = cusid;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", ordername=" + ordername + ", ordervalue=" + ordervalue + ", cusid="
				+ cusid + "]";
	}
	
	
}

