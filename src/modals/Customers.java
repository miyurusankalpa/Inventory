package modals;

import java.sql.*;

import database.Database;
import exception.ValidateException;

public class Customers extends Page implements Inventory {
	
	private int customersid;
	private String name;
	private String address;
	private String email;
	private int contact;
	
	/**
	 * @param customersid the customersid to set
	 */
	
	public void setId(int customersid)
	{
		this.customersid=customersid;
	}
	
	
	/**
	 * @return the getid
	 */
	public int getId()
	{
		return customersid;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String cname) {
		name = cname;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String caddress) {
		address = caddress;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String cemail) {
		email = cemail;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * @param email the contact to set
	 */
	public void setContact(int ccontact) {
		contact = ccontact;
	}
	
	/**
	 * @return connect
	 */
	public int getContact()
	{
		return contact;
	}
	
	/**
	 * @set id and collect data from DB and create object
	 */
	public void getdatafromdb(int id) throws SQLException {
		Database c = Database.getInstance();
		ResultSet rs = c.getdata("SELECT * FROM oop.customers WHERE id='"+id+"';");

		while (rs.next()) {
			customersid = rs.getInt("id");
			name = rs.getString("customers_name");
			address = rs.getString("address");
			email = rs.getString("email");
			contact = rs.getInt("contact");
		}
	}
	
	/**
	 * @print customer data
	 */
	
	public String getdata() throws SQLException {
		Database cu = Database.getInstance();
		
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
			
			html += "<tr><th scope=\"row\">"+customersid+"</th><td>"+name+"</td><td>"+address+"</td><td>"+email+"</td><td>"+contact+"</td>"+ createbtnreport(customersid, "customers") + createBtns(customersid, "customers")+"</tr>";
		}
		
		return html;
	}
	
	
	
	/**
	 * @customer list 
	 */
     public String getcustomers(int select) throws SQLException {
		Database c = Database.getInstance();
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
     
     
     
     
     /**
 	 * @ database create query,delete query, edit query function
 	 */
	
	public String createquery() {
		return "INSERT INTO `oop`.`customers` (`id`, `customers_name`, `address`, `email`, `contact`) VALUES (null,\""+ this.name+"\",\""+ this.address+"\",\""+ this.email+"\",\""+ this.contact+"\");";
	}

	public String deletequery() {
		return "DELETE FROM  `oop`.`customers` WHERE id=' "+this.customersid+"'";
	}

	public String editquery() {
		return "UPDATE `customers` SET customers_name='" + this.name + "', address='" + this.address + "', email='"+ this.email + "', contact='"+ this.contact + "' WHERE id = '" + this.customersid + "'";
	}
	
	
	
	
	/**
	 * @endpoint validation
	 */
	
	public void validate() throws ValidateException {

		if (name == null || name.isEmpty()) 
			 throw new ValidateException("Please specify a name");
		
		if (address == null || address.isEmpty()) 
			 throw new ValidateException("Please specify a address");
		
		if (email == null || email.isEmpty()) 
			 throw new ValidateException("Please specify a email");
		
		if (!email.contains("@")) 
			 throw new ValidateException("Please specify a valid email");
		
		if (contact<999999)
			 throw new ValidateException("Please specify a valid contact number");	
	}
}
