package customerApp.util;

public class QueryUtil {

	public static String insertdata() {
		return "insert into customer values (?,? ,? ,?)" ;
		
	}
	
	public  static String insertorder() {
		return "insert into orders (oname ,ordervalue, customerId) values (? ,? ,?)" ;
	}
}
