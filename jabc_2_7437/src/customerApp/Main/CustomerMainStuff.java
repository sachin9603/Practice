package customerApp.Main;

import java.util.Scanner;
import customerApp.Dao.*;
import customerApp.Daoimpl.CustomerDaoImpl;
import customerApp.Daoimpl.OrderAppImpl;
import customerApp.Exception.CustomerException;
import customerApp.Model.Customer;
import customerApp.Model.Orders;

public class CustomerMainStuff {

	
	private static Scanner sc  = new Scanner(System.in)  ;
	
	private static CustomerDao cdao = new CustomerDaoImpl() ;
	
	private static OrderDao oDao = new OrderAppImpl() ;
	
	
	
	public static void main(String[] args) {
		
		boolean flg  = true  ;
		
		while(flg) {
		System.out.println("press 1  for insert data");
		System.out.println("press 2  for getAll data");
		System.out.println("press 6  for order something ");
		
		System.out.println("press 3  for exit ");
		
		int choice  = sc.nextInt() ;
		
		switch(choice){
		case 1 :
			try {
				System.out.println("you want to register customer ");
				
				System.out.println("enter id of customer");
			int id	=sc.nextInt();
			
			System.out.println("enter the name of customer");

			String name = sc.next();

			System.out.println("enter the pass of customer");

			String pass = sc.next();

			System.out.println("enter the address of customer");

			String address = sc.next();
			
				
				
				
				String msg  =cdao.registercustomer(new Customer(id , name , pass, address)) ;
				
				if(msg.equals("not inserted") ){
					throw new CustomerException("you have done some thing") ;
				}
			} catch (CustomerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break ;
			
		case 3 :
			flg  = false  ;
			System.out.println("Thankyou for visiting  😎😎😎😎😎😎");
			break ;
			
		case 6 :
			
			System.out.println("you want to order ");
//			
//			System.out.println("enter order id ");
//		int id	=sc.nextInt();
//		
		System.out.println("enter the name of order");

		String name = sc.next();

		System.out.println("enter the value of order");

		Double val = sc.nextDouble();

		System.out.println("enter  the customer id ");

		int cusId = sc.nextInt();
		
			
			
			
			String msg  = oDao.doingOrder(new Orders( name , val , cusId)) ;
			
			System.out.println(msg);
		
		break ;
		}
		
		
		
		
		}
	}
}
