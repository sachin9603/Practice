package com.student;

import java.util.List;
import java.util.Scanner;

import com.student.entity.Enrollment;

import static com.student.AllOparations.*;

public class MainOperation {
	
static Scanner sc=new Scanner(System.in);

public static void mainOps()
{
	while(true) {
	System.out.println("Press 1.Student Details\nPress 2.Instructor Deatils"
			+ "\nPress 3.to provide feedback\nPress 4. to Enrollment\n"
			+ "Press 5.Course Details\nPress 6.to check all enrollment details based on course\n"
			+ "Press 7 for quit");
	int input=sc.nextInt();

	switch(input)
	{
		case 1:
			StudentOperations();
			System.out.println("=======================================");
	          break;
	          
		case 2:
			instructorOperations();
			System.out.println("=======================================");
			break;
			
		case 3:
			feedbackOperations();
			System.out.println("=======================================");
			break;
			
		case 4:
			Enrollment enrollment=studentEnrollment();
			studentService.StudentEnrollment(enrollment);
			System.out.println("Enrollment done successfully");
			break;
		case 5:
			courseOperations();
			System.out.println("=======================================");
			break;
			
		case 6:List<Enrollment> enroll=getEnrollmentByCourse();
		for(Enrollment e:enroll)
		{
			System.out.println(e);
		}
		break;
		case 7:System.exit(0);
			default:
				System.out.println("wrong input");
	}
	}

}

public static void main(String[] args)
{
	
	mainOps();

}
}
