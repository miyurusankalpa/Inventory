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

}
