
<% Page.setTitle("Add Customers");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product add");
		%>
	<a href="/Inventory/list/customers.jsp" class="btn btn-lg align-right btn-info">list</a>
	</h1>
	
	<br>
	<form action="/Inventory/customers_addata" method="post">
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name"> <br>
		  <input type="number" class="form-control"
			name="address" placeholder="enter a address"> <br>
		<input type="text" class="form-control"
			name="email" placeholder="enter a email"> <br>
		<input type="number" class="form-control"
			name="contact" placeholder="enter a contact"> <br>
		 <input
			type="submit" class="btn btn-primary float-right" value="Add">
	</form>

</div>
<jsp:directive.include file = "../footer.jsp" />