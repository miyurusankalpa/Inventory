package test;

import java.sql.*;

public class Custermer {
	
	private int custermerid;
	private String name;
	private String address;
	private String email;
	private int contact;
	
	public void setName(String cname) {
		name = cname;
	}

	public void setAddress(String caddress) {
		address = caddress;
	}
	
	public void setEmail(String cemail) {
		email = cemail;
	}
	public void setContact(int ccontact) {
		contact = ccontact;
	}
	
public String getdata() throws SQLException {
	test cu = new test();
	ResultSet rs = cu.getdata("SELECT * FROM oop.custermer;");
	
	String html = null;
	
	while(rs.next())
	{
		//rs.next();
		
		custermerid = rs.getInt("id");
		name = rs.getString("custermer_name");
		address = rs.getString("address");
		email = rs.getString("email");
		contact = rs.getInt("contact");
		
		html += "<tr><th scope=\"row\">"+custermerid+"</th><td>"+name+"</td><td>"+address+"</td><td>"+email+"</td><td>"+contact+"</td></tr>";
	}
	
	return html;
}

public String createquery() {
	return "INSERT INTO `oop`.`custermer` (`id`,	`custermer_name`, `address`, `address`, `email`, `contact`) VALUES (null,\""+ this.name+"\",\""+ this.address+"\",\""+ this.email+"\",\""+ this.contact+"\");";
    }
}
