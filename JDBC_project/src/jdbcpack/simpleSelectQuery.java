package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class simpleSelectQuery {

	public static void main(String[] args) {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/zomato";
		String uid = "root";
		String pass = "password";
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// Load the Driver
			Class.forName(driverClassName);
			System.out.println("Driver Loaded");

			// create Connection
			dbConnection = DriverManager.getConnection(url, uid, pass);
			System.out.println("Connected to db");

			// obtain some statement
			stmt = dbConnection.createStatement();
			System.out.println("Obtained the Statement");

			// Execute SQL Query
			String sqlQuery = "select rest_name,rest_branch_count,rest_cuisine" + " from restaurant_master";
			rs = stmt.executeQuery(sqlQuery);
			System.out.println("Executed SQL Select Query");

			// Navigate the Methos
			while (rs.next()) {
				String resaurantname = rs.getString(1);
				int branchcount = rs.getInt(2);
				String restcuise = rs.getString(3);

				System.out.println(resaurantname + ": "+branchcount +": "
								+ restcuise);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Unbale to load the driver");
		} finally {
			// closing all resources
			try {
				stmt.close();
				dbConnection.close();
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

}
