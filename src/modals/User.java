package modals;

import java.sql.*;

import database.Database;

public class User {

	private String username;
	private String password;

	
	//create an object of User
	private static User instance = new User();

	//make the constructor private so that this class cannot be instantiated
	private User(){}
	
	//Get the only object available
	public static User getInstance(){
	     return instance;
	}
	   
	public void setusername(String uname) {
		username = uname;
	}


	public boolean checkLogin(String username, String password) {
		Database c = Database.getInstance();

		ResultSet rs = c.getdata(
				"SELECT * FROM oop.users WHERE username=\"" + username + "\" AND password = \"" + password + "\";");


		try {
			if(rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}

}
