package test;

import java.sql.*;

import database.test;

public class Products extends Page {
	
	private int productid;
	private String name;
	private int qty;
	private int price;
	
	public void setName(String pname) {
		name = pname;
	}

	public void setQty(int pqty) {
		qty = pqty;
	}
	
	public void setPrice(int prize) {
		price = prize;
	}
	
	public String getdata() throws SQLException {
		test c = new test();
		ResultSet rs = c.getdata("SELECT * FROM oop.products;");
		
		String html;
		html = "";
		
		while(rs.next())
		{
			//if (rs == null) return false;
			//rs.next();
			
			productid = rs.getInt("id");
			name = rs.getString("products_name");
			qty = rs.getInt("quantity");
			price = rs.getInt("price");
			
			html += "<tr><th scope=\"row\">"+productid+"</th><td>"+name+"</td><td>"+qty+"</td><td>"+price+"</td>"+createBtns()+"</tr>";
		}
		
		return html;
	}
	
	public String createquery() {
		return "INSERT INTO `oop`.`products` (`id`,	`products_name`, `quantity`, `price`) VALUES (null,\""+ this.name+"\",\""+ this.qty+"\",\""+ this.price+"\");";
	}
}
