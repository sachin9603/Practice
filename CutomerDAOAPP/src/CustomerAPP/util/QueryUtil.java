
package CustomerAPP.util;

public class QueryUtil {
	
	public static String registerCustmr() {
		return "insert into customer(cName, cPassword, address) values (?,?,?)" ;
	}
	
	public static String getallCustomer() {
		
		return "select * from customer" ;
		
	}
	public static String doingOrder() {
		return "insert into orders(oname, order_value, Customer_id) values (?,?,?)" ;
	}
	

}
