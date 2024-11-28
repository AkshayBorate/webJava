package example.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	//this is a utitlity class for obtaining the connction and returning hte same
	
	public static Connection getConnection() throws Exception{
		// autoloading of driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/zomato";
		String uid = "root";
		String pass = "password";
		Connection dbConnection = DriverManager.getConnection(url,uid,pass);
		return dbConnection;
		
	}

}
