package modals;

import java.sql.*;

import database.Database;

public class Customers extends Page {
	
	private int customersid;
	private String name;
	private String address;
	private String email;
	private int contact;
	
	public void setId(int customersid)
	{
		this.customersid=customersid;
	}
	
	public int getId()
	{
		return customersid;
	}
	
	public void setName(String cname) {
		name = cname;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String caddress) {
		address = caddress;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setEmail(String cemail) {
		email = cemail;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setContact(int ccontact) {
		contact = ccontact;
	}
	
	public int getContact()
	{
		return contact;
	}
	
	public void getdatafromdb(int id) throws SQLException {
		Database c = new Database();
		ResultSet rs = c.getdata("SELECT * FROM oop.customers WHERE id='"+id+"';");

		while (rs.next()) {
			customersid = rs.getInt("id");
			name = rs.getString("customers_name");
			address = rs.getString("customers_name");
			email = rs.getString("email");
			contact = rs.getInt("contact");
		}
	}
	
	public String getdata() throws SQLException {
		Database cu = new Database();
		
		ResultSet rs = cu.getdata("SELECT * FROM oop.customers;");
		
		String html;
		html = "";
		
		while(rs.next())
		{	
			customersid = rs.getInt("id");
			name = rs.getString("customers_name");
			address = rs.getString("address");
			email = rs.getString("email");
			contact = rs.getInt("contact");
			
			html += "<tr><th scope=\"row\">"+customersid+"</th><td>"+name+"</td><td>"+address+"</td><td>"+email+"</td><td>"+contact+"</td>"+createBtns(customersid, "customers")+"</tr>";
		}
		
		return html;
	}


	public String getcustomers(int select) throws SQLException {
		Database c = new Database();
		ResultSet rs = c.getdata("SELECT * FROM oop.customers;");
		
		String html = "";
		String s = "";
		
		while (rs.next()) {
			customersid = rs.getInt("id");
			name = rs.getString("customers_name");
			
			if(select==customersid) s = "selected";  else s = "";
			html += "<option value=\""+ customersid +"\" "+s+">" + name + "</option>";
		}

		return html;
	}
	
	public String createquery() {
		return "INSERT INTO `oop`.`customers` (`id`, `customers_name`, `address`, `email`, `contact`) VALUES (null,\""+ this.name+"\",\""+ this.address+"\",\""+ this.email+"\",\""+ this.contact+"\");";
	    }

	public String deletequery() {
		return "DELETE FROM  `oop`.`customers` WHERE id=' "+this.customersid+"'";
	}

	public String editquery() {
		return "UPDATE `customers` SET customers_name='" + this.name + "', address='" + this.address + "', email='"+ this.email + "', contact='"+ this.contact + "' WHERE id = '" + this.customersid + "'";
	}
}
