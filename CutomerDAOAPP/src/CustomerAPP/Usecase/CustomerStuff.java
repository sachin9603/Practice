package CustomerAPP.Usecase;

import java.util.List;
import java.util.Scanner;

import CustomerAPP.Dao.CustomerDao;
import CustomerAPP.Dao.OrderDao;
import CustomerAPP.DaoImpl.CustomerDaoImpl;
import CustomerAPP.DaoImpl.OrderImpl;
import CustomerAPP.Exception.CustomerException;
import CustomerAPP.model.Customer;
import CustomerAPP.model.Orders;

public class CustomerStuff {
	
	public static CustomerDao  dao   = new CustomerDaoImpl() ; 
	
	public static OrderDao OrderDao   = new OrderImpl() ; 
	
	public static Scanner sc  = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		
		
		boolean flg  = true  ;
		while(flg) {
			System.out.println("Enter your choice "); 
			
			System.out.println("1 for inserting data ");
			System.out.println("2 for update data ");
			System.out.println("3 for delete  data ");
			System.out.println("4 for get all Customer data ");
			System.out.println(" 7 for ordering something ");
			System.out.println(" 8 for  get all order by your id  ");
			System.out.println("5  for  exit ");
			
			int cusChoice  = sc.nextInt() ;
			
			switch(cusChoice) {
			case 1 :
				System.out.println("Enter your name");
				String name  = sc.next() ;
				
				System.out.println("Enter your password");
				String password   = sc.next() ;
				
				System.out.println("Enter your address");
				String address  = sc.next() ;
				
				Customer c1  = new Customer(name , password  , address) ; 
				
				try {
					String msggg  = dao.registerCustomer(c1);
					System.out.println(msggg);
				} catch (CustomerException e) {
					// TODO Auto-generated catch block 
					}
				break ;
				
			case 7 :
				System.out.println("Enter Order name");
				String oname  = sc.next() ;
				
				System.out.println("Enter Order value");
				int oValue   = sc.nextInt() ;
				
		          Orders o  = new Orders(oname  , oValue) ;
		          String msggg;
				try {
					msggg = OrderDao.doingOrder(o);
					System.out.println(msggg);
				} catch (CustomerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
				
				break ;
			case 8  :
				System.out.println("enter your id  ");
				int id  =sc.nextInt() ;
				List<Orders> allorders;
				try {
					allorders = OrderDao.getallorderByID(id);
					System.out.println(allorders);
				} catch (CustomerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				break ;
				
				
			case 4  :
				List<Customer> alldata = dao.getAllCustomer();
				for (Customer c: alldata) {CustomerStuff .print(c);
				}
				break ;
				
			
				case 5: 
			
	
				flg = false  ;
			System.out.println("Thank you for visit");
			break ;
			default :
				System.out.println(" kindly choose right option ");
		}
	}
	

}
	public static void print(Customer c) {
		
		System.out.println("Cusomer ID = " + c.getcId());
		System.out.println("Cusomer name = " + c.getCName());
        System.out.println("Cusomer password = " + c.getCPassword());
        System.out.println("Cusomer  Address = " + c.getAddress());
        System.out.println("------------------------------------------------------------------4");
}
	
}
