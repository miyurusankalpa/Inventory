<%@page import="modals.*" %>
<% Page.setTitle("Edit Transactions");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Edit Transactions");
		%>
	<a href="/Inventory/list/transactions.jsp" class="btn btn-lg align-right btn-info"><i class="fa fa-list"></i>  list</a>
	</h1><br>
	<%
		String s = request.getParameter("id");
		Transactions t = new Transactions();

		if (s == null)
			out.print("<h3 class=\"alert alert-danger\">Empty ID</h3>");
		else {
			int i = Integer.parseInt(s);
			t.getdatafromdb(i);
		}
	%>
	<div class="card card-body bg-light">
	<form action="/Inventory/Transactions_Edit" method="post">
	<label>ID</label>
		<input type="text" class="form-control"
			name="id" placeholder="id" value="<% out.print(t.getId()); %>" readonly> <br>
			<label>Date</label>
	 	<input type="date" class="form-control"
			name="date" placeholder="enter a date" value="<% out.print(t.getDate()); %>"> <br>
			<label>Product</label>
		<select class="form-control" name="products">
		  <option value="" disabled hidden>select a product id</option>
		    <%
		    Products p = new Products();
	
		    if (s != null) out.print(p.getproducts(t.getProduct().getId()));
		    %>
		  </select>
		<br><label>Customer</label>
		<select class="form-control" name="customers">
		  <option value="" disabled hidden>select a customer</option>
		    <%
		    Customers c = new Customers(); 

		    if (s != null) out.print(c.getcustomers(t.getCustomer().getId()));
		    %>
		  </select>
		<br><label>Quantity</label>
		<input type="number" class="form-control"
			name="total" placeholder="enter a total" value="<% out.print(t.getTotal()); %>"> <br>
		 <button type="submit" class="btn btn-primary float-right" value="Add"><i class="fa fa-save"></i> Save</button>
	</form>
 </div>
</div>
<jsp:directive.include file = "../footer.jsp" />