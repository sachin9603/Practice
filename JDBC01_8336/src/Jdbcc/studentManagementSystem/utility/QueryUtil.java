package studentManagementSystem.utility;

public class QueryUtil {
	
	
	public static String registerStudent() {
return "INSERT INTO student(sid, sname, studentAddress) VALUES (?,?,?,?)";

	}

}
