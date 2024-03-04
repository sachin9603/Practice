package Student.usecase;

import java.util.Scanner;

import Student.Exception.StudentException;
import Student.dao.StudentDao;
import Student.daoimpl.StudentDaoimpl;
import Student.model.Student;

public class StudentMainClass {

	private static Scanner  sc  = new Scanner(System.in) ;
	private static StudentDao dao  = new StudentDaoimpl() ;
	
	public static void main(String[] args) throws StudentException {
		boolean flg  = true  ;
		
		while(flg){
			
			System.out.println("1 for regester student ");
			System.out.println("2 for delete student ");
			System.out.println("3 for get all student ");
			System.out.println("4 for update student ");
			System.out.println("5 for exit app ");
			
			System.out.println("==============*****************************============================");
			
			int choice  = sc.nextInt() ;
			
			switch(choice) {
			
			case 1: 
				System.out.println("you want to register a new Student");
				
				System.out.println("enter the roll number of studnet ");
				
				int roll  = sc.nextInt() ;
				
				System.out.println("enter the name of studnet ");
				
				String name  = sc.next() ;
				
				System.out.println("enter the marks of studnet ");
				
				int marks  = sc.nextInt() ;
				
				Student s = new Student(roll , name  , marks );
				
				String ans  = dao.registerStudent(s) ;
				
				System.out.println(ans);
				
				break ; 
				
			case 5: 
				System.out.println("thakyou for visiting ");
				
				flg  = false  ;
				break  ;
				
			
			}
			
			
			
			
			
		}
		
		
		
	}

}
