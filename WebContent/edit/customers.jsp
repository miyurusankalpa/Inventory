<%@page import="modals.*" %>
<% Page.setTitle("Edit Customers");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("customers edit");
		%>
	<a href="/Inventory/list/customers.jsp" class="btn btn-lg align-right btn-info">list</a>
	</h1>
	<%
		String s = request.getParameter("id");
		int i = Integer.parseInt(s);
		Customers c = new Customers(); 
		c.getdatafromdb(i);
		
	%>
	<br>
	<form action="/Inventory/Customers_Edit" method="post">
	<input type="text" class="form-control"
			name="id" placeholder="id" value="<% out.print(c.getId()); %>" readonly> <br>
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name" value="<% out.print(c.getName()); %>"> <br>
		  <input type="text" class="form-control"
			name="address" placeholder="enter a address" value="<% out.print(c.getAddress()); %>"> <br>
		<input type="text" class="form-control"
			name="email" placeholder="enter a email" value="<% out.print(c.getEmail()); %>"> <br>
		<input type="number" class="form-control"
			name="contact" placeholder="enter a contact" value="<% out.print(c.getContact()); %>"> <br>
		 <input
			type="submit" class="btn btn-primary float-right" value="Edit">
	</form>

</div>
<jsp:directive.include file = "../footer.jsp" />