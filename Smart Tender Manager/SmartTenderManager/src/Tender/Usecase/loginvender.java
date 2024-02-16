package Tender.Usecase;

import java.util.Scanner;

import Tender.Exception.VenderException;
import Tender.Model.Vender;
import Tender.daoImpl.VenderDaoimpl;

public class loginvender {

	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter vender User Name : ");
			String email = sc.next();
			System.out.println("Enter vender User password  : ");
			String password = sc.next();
			
			VenderDaoimpl ss = new VenderDaoimpl();
			
			
			
			try {
				Vender s = ss.LoginVender(email, password);
				
				System.out.println(s);
			} catch (VenderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}


	
}
