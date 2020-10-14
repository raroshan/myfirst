package Arrays;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionInterviewQuestion_01 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			 test(); 
			 }
			catch (IOException e) {
			    e.printStackTrace();
			}
			catch (SQLException e) {
			    e.printStackTrace();
			}
		finally {
			try {
				
				throw new RuntimeException("runtime exception");
				
			}catch(Exception e) {
				
			}
		}
	}
	
	public static void test() throws IOException, SQLException, FileNotFoundException {
		System.out.println("Inside test() method"); 
		 
		}

}
