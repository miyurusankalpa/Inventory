package test;

import java.sql.*;

import database.test;

public class Customers extends Page {
	
	private int customersid;
	private String name;
	private String address;
	private String email;
	private int contact;
	
	public void setID(int customersid)
	{
		this.customersid=customersid;
	}
	
	public int getID()
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
	
public String getdata() throws SQLException {
	test cu = new test();
	
	ResultSet rs = cu.getdata("SELECT * FROM oop.customers;");
	
	String html;
	html = "";
	
	while(rs.next())
	{
		//rs.next();
		
		customersid = rs.getInt("id");
		name = rs.getString("customers_name");
		address = rs.getString("address");
		email = rs.getString("email");
		contact = rs.getInt("contact");
		
		html += "<tr><th scope=\"row\">"+customersid+"</th><td>"+name+"</td><td>"+address+"</td><td>"+email+"</td><td>"+contact+"</td>"+createBtns(customersid, "customers")+"</tr>";
	}
	
	return html;
}

public String createquery() {
	return "INSERT INTO `oop`.`customers` (`id`, `customers_name`, `address`, `email`, `contact`) VALUES (null,\""+ this.name+"\",\""+ this.address+"\",\""+ this.email+"\",\""+ this.contact+"\");";
    }

public String deletequery(String id) {
	return "DELETE FROM  `oop`.`customers` WHERE id=' "+id+"'";
}

}
