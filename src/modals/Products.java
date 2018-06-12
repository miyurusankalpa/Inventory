package modals;

import java.sql.*;

import database.Database;
import exception.ValidateException;

public class Products extends Page implements Inventory {

	private int productid;
	private String name;
	private int qty;
	private int price;

	public void setId(int pid) {
		productid = pid;
	}

	public void setName(String pname) {
		name = pname;
	}

	public void setQty(int pqty) {
		qty = pqty;
	}

	public void setPrice(int prize) {
		price = prize;
	}

	public int getId() {
		return productid;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public int getPrice() {
		return price;
	}
	
	public void getdatafromdb(int id) throws SQLException {
		Database c = Database.getInstance();
		ResultSet rs = c.getdata("SELECT * FROM oop.products WHERE id='"+id+"';");

		while (rs.next()) {
			productid = rs.getInt("id");
			name = rs.getString("products_name");
			qty = rs.getInt("quantity");
			price = rs.getInt("price");
		}
	}

	public String getdata() throws SQLException {
		Database c = Database.getInstance();
		ResultSet rs = c.getdata("SELECT * FROM oop.products;");

		String html;
		html = "";

		while (rs.next()) {
			// if (rs == null) return false;
			// rs.next();

			productid = rs.getInt("id");
			name = rs.getString("products_name");
			qty = rs.getInt("quantity");
			price = rs.getInt("price");

			html += "<tr><th scope=\"row\">" + productid + "</th><td>" + name + "</td><td>" + qty + "</td><td>" + price
					+ "</td>" + createbtnreport(productid, "products") + createBtns(productid, "products") + "</tr>";
		}

		return html;
	}

	public String getproducts(int select) throws SQLException {
		Database c = Database.getInstance();
		ResultSet rs = c.getdata("SELECT * FROM oop.products;");
		
		String html = "";
		String s = "";
		
		while (rs.next()) {
			productid = rs.getInt("id");
			name = rs.getString("products_name");
			qty = rs.getInt("quantity");
			price = rs.getInt("price");
			
			if(select==productid) s = "selected";  else s = "";
			html += "<option value=\""+ productid +"\" "+s+">" + name + "</option>";
		}

		return html;
	}
	
	public String deletequery() {
		return "DELETE FROM `products` WHERE id='" + this.productid + "'";
	}

	public String createquery() {
		return "INSERT INTO `products` (`id`,	`products_name`, `quantity`, `price`) VALUES (null,\"" + this.name
				+ "\",\"" + this.qty + "\",\"" + this.price + "\");";
	}

	public String editquery() {
		return "UPDATE `products` SET products_name='" + this.name + "', quantity='" + this.qty + "', price='"
				+ this.price + "' WHERE id = '" + this.productid + "'";
	}
	
	public void validate() throws ValidateException {

		if (name == null || name.isEmpty()) 
			 throw new ValidateException("Please specify a name");
		
		if (price<0)
			 throw new ValidateException("Please specify valid price");
		
		if (qty<0)
			 throw new ValidateException("Please specify valid qty");	
	}
}
