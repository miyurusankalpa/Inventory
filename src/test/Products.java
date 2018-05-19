package test;

import java.sql.*;

import database.test;

public class Products extends Page {

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
		test c = new test();
		ResultSet rs = c.getdata("SELECT * FROM oop.products WHERE id='"+id+"';");

		while (rs.next()) {
			productid = rs.getInt("id");
			name = rs.getString("products_name");
			qty = rs.getInt("quantity");
			price = rs.getInt("price");
		}
	}

	public String getdata() throws SQLException {
		test c = new test();
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
					+ "</td>" + createBtns(productid, "products") + "</tr>";
		}

		return html;
	}

	public String deletequery() {
		return "DELETE FROM `products` WHERE id=' " + this.productid + "'";
	}

	public String createquery() {
		return "INSERT INTO `products` (`id`,	`products_name`, `quantity`, `price`) VALUES (null,\"" + this.name
				+ "\",\"" + this.qty + "\",\"" + this.price + "\");";
	}

	public String editquery() {
		return "UPDATE `products` SET products_name='" + this.name + "', quantity='" + this.qty + "', price='"
				+ this.price + "' WHERE id = '" + this.productid + "'";
	}
}
