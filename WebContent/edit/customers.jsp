<%@page import="modals.*" %>
<% Page.setTitle("Edit Customers");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Edit Customers");
		%>
	<a href="/Inventory/list/customers.jsp" class="btn btn-lg align-right btn-info"><i class="fa fa-list"></i> list</a>
	</h1> <br>
	<%
		String s = request.getParameter("id");
		
		Customers c = new Customers(); 
		
		if(s==null) out.print("<h3 class=\"alert alert-danger\">Empty ID</h3>"); else {
	
		int i = Integer.parseInt(s);
		c.getdatafromdb(i);
		
		}
	%>
	<div class="card card-body bg-light">
	<form action="/Inventory/Customers_Edit" method="post">
	<label>ID</label>
	<input type="text" class="form-control"
			name="id" placeholder="id" value="<% out.print(c.getId()); %>" readonly> <br>
			<label>Name</label>
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name" value="<% out.print(c.getName()); %>"> <br>
			<label>Address</label>
		  <input type="text" class="form-control"
			name="address" placeholder="enter a address" value="<% out.print(c.getAddress()); %>"> <br>
			<label>Email</label>
		<input type="text" class="form-control"
			name="email" placeholder="enter a email" value="<% out.print(c.getEmail()); %>" required pattern="[^@]+@[^@]+\.[a-zA-Z]{2,6}"> <br>
			<label>Contact Number</label>
		<input type="number" class="form-control"
			name="contact" placeholder="enter a contact" value="<% out.print(c.getContact()); %>"> <br>
		 <button type="submit" class="btn btn-primary float-right" value="Add"><i class="fa fa-save"></i> Save</button>
	</form>
</div>
</div>
<jsp:directive.include file = "../footer.jsp" />