<%@page import="modals.*" %>
<% Page.setTitle("Add Transactions");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Add Transactions");
		%>
	<a href="/Inventory/list/transactions.jsp" class="btn btn-lg align-right btn-info"><i class="fa fa-list"></i> list</a>
	</h1>
	
	<br>
	<div class="card card-body bg-light">
	<form action="/Inventory/transactions_addata" method="post">
		<label>Date</label>
		 <input type="date" class="form-control"
			name="date" placeholder="enter a date"> <br>
			<label>Product</label>
		  <select class="form-control" name="products">
		  <option value="" disabled selected hidden>select a product</option>
		    <%
		    Products p = new Products(); 
		    out.print(p.getproducts(0));
		    %>
		  </select>
		<br>
		<label>Customer</label>
		<select class="form-control" name="customers">
		  <option value="" disabled selected hidden>select a customer</option>
		    <%
		    Customers c = new Customers(); 
		    out.print(c.getcustomers(0));
		    %>
		  </select>
		<br>
		<label>Number</label>
		<input type="number" class="form-control"
			name="total" placeholder="enter a total value"> <br>
		 <button type="submit" class="btn btn-primary float-right" value="Add"><i class="fa fa-plus"></i> Add</button>
	</form>
 </div>
</div>
<jsp:directive.include file = "../footer.jsp" />