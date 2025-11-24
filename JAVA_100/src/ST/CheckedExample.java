package ST;
import java.io.*;

public class CheckedExample {
public static void main(String[] args) {
	  try {
		FileReader fr = new FileReader("abc.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} // file might not exist
	
}
}
