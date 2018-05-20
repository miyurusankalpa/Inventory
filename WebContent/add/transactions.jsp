<%@page import="test.*" %>
<% Page.setTitle("Add Transactions");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("transactions add");
		%>
	<a href="/Inventory/list/transactions.jsp" class="btn btn-lg align-right btn-info">list</a>
	</h1>
	
	<br>
	<form action="/Inventory/transactions_addata" method="post">
		 <input type="date" class="form-control"
			name="date" placeholder="enter a date"> <br>
		  <select class="form-control" name="products">
		  <option value="" disabled selected hidden>select a product</option>
		    <%
		    Products p = new Products(); 
		    out.print(p.getproducts(0));
		    %>
		  </select>
		<br>
		<select class="form-control" name="customers">
		  <option value="" disabled selected hidden>select a customer</option>
		    <%
		    Customers c = new Customers(); 
		    out.print(c.getcustomers(0));
		    %>
		  </select>
		<br>
		<input type="number" class="form-control"
			name="total" placeholder="enter a total"> <br>
		 <input
			type="submit" class="btn btn-primary float-right" value="Add">
	</form>

</div>
<jsp:directive.include file = "../footer.jsp" />