package DBUtils;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbutils {
	public static final String DBUtils = null;
	static Connection con;
	static Statement stmt;
	
	static {
		try {
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customermanagement","root","Test@123");
		 stmt=(Statement) con.createStatement();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void executeQuery(String query) {
		try {
			stmt.execute(query);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static ResultSet executeQueryGetResult1(String query) {
		ResultSet resultset=null;
		try {
			resultset=((java.sql.Statement) stmt).executeQuery(query);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resultset;
	}
	public static ResultSet executeQueryGetResult(String query) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void executeQuery1(String query) {
		// TODO Auto-generated method stub
		
	}
}

