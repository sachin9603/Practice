package mysqlFirst;

public class Querry {
	
	 public static String giveStandAdd() {
		 return "select s.sid, s.sname , s.smarks , a.city  ,a.state  from student s Inner join address a On s.sid = a.studentId  ";
	 }

}
