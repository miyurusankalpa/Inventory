package test;

import java.sql.*;

public class Products {
	
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
		ResultSet rs = c.getdata();
		
		String html = null;
		
		while(rs.next())
		{
			//rs.next();
			
			productid = rs.getInt("id");
			name = rs.getString("products_name");
			qty = rs.getInt("quantity");
			price = rs.getInt("price");
			
			html += "<tr><th scope=\"row\">"+productid+"</th><td>"+name+"</td><td>"+qty+"</td><td>"+price+"</td></tr>";
		}
		
		return html;
	}
	
	public String createquery() {
		return "INSERT INTO `oop`.`products` (`id`,	`products_name`, `quantity`, `price`) VALUES (null,\""+ this.name+"\",\""+ this.qty+"\",\""+ this.price+"\");";
	}
}
