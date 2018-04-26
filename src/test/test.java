package test;

import java.sql.*;

public class test {

	public String testc() throws ClassNotFoundException {
		Connection conn = null;
		final String DB_URL = "jdbc:mysql://localhost/database";

		Class.forName("com.mysql.jdbc.Driver");

		try {
			conn = DriverManager.getConnection(DB_URL, "test", "test");
			return "Connected";
		} catch (SQLException e) {
			return "Error, " + e.getMessage();
		}
	}
	
	public Connection connect() throws ClassNotFoundException {
		Connection conn = null;
		final String DB_URL = "jdbc:mysql://localhost/oop";

		Class.forName("com.mysql.jdbc.Driver");

		try {
			conn = DriverManager.getConnection(DB_URL, "test", "test");
		} catch (SQLException e) {
		
		}
		return conn;
	}
	
	//just tessting
	
	public String adddata(String sql)
	{
		try {
			Connection con = this.connect();
			
			try {
				Statement sta = con.createStatement();
				
				
				sta.executeUpdate(sql);
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Success addded data";

	}

	public ResultSet getdata()
	{
		ResultSet rs = null;
		try {
			Connection con = this.connect();
			
			try {
				Statement sta = con.createStatement();
				
				
				rs = sta.executeQuery("SELECT * FROM oop.products;");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;

	}
}
