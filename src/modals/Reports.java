package modals;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.Database;

public class Reports {
	public String productReport(int i) throws SQLException {
			Database c = Database.getInstance();
			ResultSet rs = c.getdata("SELECT SUM(total) as total, customers as customer_id FROM transactions WHERE products='"+i+"' GROUP BY customers;");

			String html = "";

			while (rs.next()) {
				int totalQty = rs.getInt("total");
				int customers = rs.getInt("customer_id");
				
				Customers c1 = new Customers();
				c1.getdatafromdb(customers);
								
				html += "<tr><td scope=\"row\">" + c1.getName() + "</td><td>" + c1.getAddress() + "</td><td>" + totalQty + "</td></tr>";
			}
			
			return html;
	}
	
	public String productCustomer(int i) throws SQLException {
		Database c = Database.getInstance();
		ResultSet rs = c.getdata("SELECT SUM(total) as total, products as product_id FROM transactions WHERE customers='"+i+"' GROUP BY products;");

		String html = "";

		while (rs.next()) {
			int totalQty = rs.getInt("total");
			int productId = rs.getInt("product_id");

			Products p1 = new Products();
			p1.getdatafromdb(productId);
			
			int totalPrice = totalQty * p1.getPrice();
			
			html += "<tr><td scope=\"row\">" + p1.getName() + "</td><td>" + p1.getPrice() + "</td><td>" + totalQty + "</td><td>" + totalPrice + "</td></tr>";
		}
		
		return html;
}
}
