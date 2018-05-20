package modals;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.Database;

public class Transactions extends Page {
	
	private int id;
	private String date;
	private int total;
	private Products product;
	private Customers customer;
	
	public void setId(int i) {
		id = i;
	}
	
	public void setDate(String pdate) {
		date = pdate;
	}

	public void setProduct(Products pro) {
		product = pro;
	}
	
	public void setTotal(int tot) {
		total = tot;
	}

	public void setCustomer(Customers c) {
		customer = c;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDate() {
		return date;
	}

	public Products getProduct() {
		return product;
	}
	
	public int getTotal() {
		return total;
	}
	
	public Customers getCustomer() {
		return customer;
	}
	
	public void getdatafromdb(int i) throws SQLException {
		Database c = new Database();
		ResultSet rs = c.getdata("SELECT * FROM oop.transactions WHERE id='"+i+"';");

		while (rs.next()) {
			id = rs.getInt("id");
			date = rs.getString("date");
			
			Products p1 = new Products();
			p1.getdatafromdb(rs.getInt("products"));
			product = p1;
			
			Customers c1  = new Customers();
			c1.getdatafromdb(rs.getInt("customers"));
			customer = c1;
			
			total = rs.getInt("total");
		}
	}
	
	public String getdata() throws SQLException {
		Database c = new Database();
		ResultSet rs = c.getdata("SELECT * FROM oop.transactions;");
		
		String html;
		html = "";
		
		while(rs.next())
		{
			//if (rs == null) return false;
			//rs.next();
			
			id = rs.getInt("id");
			date = rs.getString("date");
			
			Products p1 = new Products();
			p1.getdatafromdb(rs.getInt("products"));
			
			Customers c1  = new Customers();
			c1.getdatafromdb(rs.getInt("customers"));
			
			total = rs.getInt("total");
			
			html += "<tr><th scope=\"row\">"+id+"</th><td>"+date+"</td><td>"+p1.getName()+"</td><td>"+c1.getName()+"</td><td>"+total+"</td>"+createBtns(id, "transactions")+"</tr>";
		}
		
		return html;
	}
	
	public String createquery() {
		return "INSERT INTO `transactions` (`id`, `date`, `products`, `customers`, `total`) VALUES (null,\""+ this.date+"\",\""+ this.product.getId()+"\",\""+ this.customer.getId()+"\",\""+ this.total+"\");";
	}
	
	public String deletequery() {
		return "DELETE FROM `transactions` WHERE id=' "+this.id+"'";
	}
	
	public String editquery() {
		return "UPDATE `transaction` SET date='" + this.date + "', products='" + this.product.getId() + "', customers ='" + this.customer.getId() + "', total='"
				+ this.total + "' WHERE id = '" + this.id + "'";
	}
}
