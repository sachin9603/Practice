package Utility;

public class QueryUtil {

	public static String insertStudent() {
		return "insert into student(sname, smarks , saddress) values (?,?,?)";
	}
	public static String getAllStudent() {
		return "select * from Student";
	}
}
