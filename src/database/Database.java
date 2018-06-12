package database;

import java.sql.*;

public class Database {
	  private static Database instance = new Database();
	  private Database(){}
	  private Connection conn = null;

	  public static Database getInstance(){
	     return instance;
	 }
	   
	public Connection connect() throws ClassNotFoundException{
		final String DB_URL = "jdbc:mysql://localhost/oop";

		Class.forName("com.mysql.jdbc.Driver");

		try {
			if(conn==null) conn = DriverManager.getConnection(DB_URL, "test", "test");
		} catch (SQLException e) {
			e.getMessage();
		}
		
		//Connection con = this.connect();
		return conn;
	}
	
	
	public String adddata(String sql)
	{
		try {
			Connection con = this.connect();
		    //System.out.println(con);
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
		     //System.out.println(con);

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
