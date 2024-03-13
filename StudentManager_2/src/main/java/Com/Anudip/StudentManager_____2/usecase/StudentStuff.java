package Com.Anudip.StudentManager_____2.usecase;

import java.util.Scanner;

import Com.Anudip.StudentManager_____2.Exception.StudentException;
import Com.Anudip.StudentManager_____2.Model.Address;
import Com.Anudip.StudentManager_____2.Model.Student;
import Com.Anudip.StudentManager_____2.service.*;
import Com.Anudip.StudentManager_____2.serviceimpl.AddressServiceImpl;
import Com.Anudip.StudentManager_____2.serviceimpl.StudentServiceImpl;

public class StudentStuff {
	private static Scanner sc  = new Scanner(System.in) ;
	
	private static studentService stsercice = new StudentServiceImpl() ;
	private static AddressService Addressservice = new AddressServiceImpl() ;
	public static void main(String[] args) {
		
		boolean flg = true  ;
		
		while(flg) {
			System.out.println(" 1 for enter student data ");
			System.out.println("3 for enter address ") ;
			
			System.out.println("2 for exit ");
			
			int choice = sc.nextInt() ;
			
			switch(choice){
			case 1:
				System.out.println("enter student id ");
				String id  = sc.next() ;
				
				System.out.println("enter student name ");
				String name  = sc.next() ;
				
				System.out.println("enter student marks ");
				int marks  = sc.nextInt() ;
				
				
				System.out.println("enter Address id ");
				int Addressid  = sc.nextInt() ;
				
				
				
				//Address  a  = new Address(12 , "Bhopal(lalgahti)" , "MP") ;
				
			
				try {
					Address add  = Addressservice.getaddressById(Addressid) ;
					
					// mai pehle addess find karunga with Aid and save that address with that student 
					Student s  = new Student(id ,name ,marks) ;
					s.setAddress(add);
					
					stsercice.saveStudent(s); 
					
					
				} catch (StudentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break ;
				
			case 3:
				System.out.println("enter address id ");
				int Aid  = sc.nextInt() ;
				
				System.out.println("enter address city ");
				String CITY  = sc.next() ;
				
				System.out.println("enter address state ");
				String state  = sc.next() ;
				
				Address  aa  = new Address(Aid , CITY , state) ;
				
			Addressservice.saveAddess(aa) ;
					
			
				break ;

				
			}
			
		}
		
		
		
		
		
	}

}
