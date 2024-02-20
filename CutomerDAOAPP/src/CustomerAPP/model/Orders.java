package CustomerAPP.model;

public class Orders {

	private int orderId ;
	
	private String orderName  ;
	
	private int orderValue  ;
	
	private  int customerId ;
	
	

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(int orderValue) {
		this.orderValue = orderValue;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	

	public Orders(String orderName, int orderValue) {
		super();
		this.orderName = orderName;
		this.orderValue = orderValue;
	}

	public Orders(int orderId, String orderName, int orderValue, int customerId) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderValue = orderValue;
		this.customerId = customerId;
	}
	
	
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderName=" + orderName + ", orderValue=" + orderValue
				+ ", customerId=" + customerId + "]";
	}

	public Orders() {} ;
	
	
	
}
