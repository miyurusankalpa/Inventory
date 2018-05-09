package test;

import java.sql.*;

public class User {

	private String username;
	private String password;

	public void setusername(String uname) {
		username = uname;
	}



	public boolean checkLogin(String username, String password) {
		test c = new test();

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
