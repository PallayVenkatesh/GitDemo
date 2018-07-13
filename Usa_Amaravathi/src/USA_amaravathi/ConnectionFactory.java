package USA_amaravathi;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ConnectionFactory {

	/**
	 * Get a connection to database
	 * 
	 * @return Connection object
	 */
	public static Connection getConnection() {
		try {

			JDBCSingleton xyz = JDBCSingleton.getInstance();
			String URL = xyz.getProperty("URL");
			String USER = xyz.getProperty("USER");
			String PASS = xyz.getProperty("PASS");
			
			DriverManager.registerDriver(new Driver());
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/usa_amaravathi?autoReconnect=true&useSSL=false", "root", "root");
		} catch (SQLException ex) {
			throw new RuntimeException("Error connecting to the database", ex);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionFactory.getConnection();

	}

}
