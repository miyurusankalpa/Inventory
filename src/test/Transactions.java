package test;

import java.sql.*;

import database.test;

public class Transactions extends Page {
	
	private int id;
	private String date;
	private int products;
	private int total;
	
	public void setId(int i) {
		id = i;
	}
	
	public void setDate(String pdate) {
		date = pdate;
	}

	public void setProducts(int pro) {
		products = pro;
	}
	
	public void setTotal(int tot) {
		total = tot;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDate() {
		return date;
	}

	public int setProducts() {
		return products;
	}
	
	public int setTotal() {
		return total;
	}
	
	public String getdata() throws SQLException {
		test c = new test();
		ResultSet rs = c.getdata("SELECT * FROM oop.transactions;");
		
		String html;
		html = "";
		
		while(rs.next())
		{
			//if (rs == null) return false;
			//rs.next();
			
			id = rs.getInt("id");
			date = rs.getString("date");
			products = rs.getInt("products");
			total = rs.getInt("total");
			
			html += "<tr><th scope=\"row\">"+id+"</th><td>"+date+"</td><td>"+products+"</td><td>"+total+"</td>"+createBtns(id, "transactions")+"</tr>";
		}
		
		return html;
	}
	
	public String createquery() {
		return "INSERT INTO `oop`.`transactions` (`id`,	`date`, `products`, `total`) VALUES (null,\""+ this.date+"\",\""+ this.products+"\",\""+ this.total+"\");";
	}
	
	public String deletequery() {
		return "DELETE FROM  `oop`.`transaction` WHERE id=' "+id+"'";
	}
	
}
