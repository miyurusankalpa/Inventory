package test;

import java.sql.*;

public class test {

	public String testc() throws ClassNotFoundException {
		
		Connection conn = connect();

		if(conn!=null) {
			return "Connected";
		} else {
			return "Error";
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

	public ResultSet getdata(String sql)
	{
		ResultSet rs = null;
		try {
			Connection con = this.connect();
			
			try {
				Statement sta = con.createStatement();
				
				
				rs = sta.executeQuery(sql);
				
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
