package Com.Intenship.EMS;

import java.sql.Connection;
import java.sql.DriverManager;

//This class used connectivity between java and Mysql
public class DBConnection {
	
		
	
static Connection con;
private static String url="jdbc:mysql://localhost:3306/employeedb";
private static String username="root";
private static String password="root";
public static Connection createDBConnection() {
	
	try {
		//load driver
		Class.forName("com.mysql.jdbc.Driver");		
		con=DriverManager.getConnection(url,username,password);
	}catch(Exception ex) {
		
		//This method is used find what type of exception we are getting
		ex.printStackTrace();
	}
	return con;
}
}