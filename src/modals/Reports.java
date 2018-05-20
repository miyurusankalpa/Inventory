package modals;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.Database;

public class Reports {
	public String productReport(int i) throws SQLException {
			Database c = new Database();
			ResultSet rs = c.getdata("SELECT SUM(total) as total, customers FROM transactions WHERE products='"+i+"' GROUP BY customers;");

			String html = "";

			while (rs.next()) {
				int total = rs.getInt("total");
				int customers = rs.getInt("customers");

				Customers c1 = new Customers();
				c1.getdatafromdb(customers);
				
				html += "<tr><td scope=\"row\">" + c1.getName() + "</td><td>" + c1.getAddress() + "</td><td>" + total + "</td></tr>";
			}
			
			return html;
	}
	
	public String productCustomer(int i) throws SQLException {
		Database c = new Database();
		ResultSet rs = c.getdata("SELECT SUM(total) as total, products FROM transactions WHERE customers='"+i+"' GROUP BY products;");

		String html = "";

		while (rs.next()) {
			int total = rs.getInt("total");
			int products = rs.getInt("products");

			Products p1 = new Products();
			p1.getdatafromdb(products);
			
			html += "<tr><td scope=\"row\">" + p1.getName() + "</td><td>" + p1.getPrice() + "</td><td>" + total + "</td></tr>";
		}
		
		return html;
}
}
