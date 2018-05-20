<%@page import="modals.*" %>
<% Page.setTitle("Edit Transactions");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("transactions edit");
		%>
	<a href="/Inventory/list/transactions.jsp" class="btn btn-lg align-right btn-info">list</a>
	</h1>
	<%
		String s = request.getParameter("id");
		int i = Integer.parseInt(s);
		Transactions t = new Transactions(); 
		t.getdatafromdb(i);
		
	%>
	<br>
	<form action="/Inventory/Transactions_Edit" method="post">
		<input type="text" class="form-control"
			name="id" placeholder="id" value="<% out.print(t.getId()); %>" readonly> <br>
	 	<input type="date" class="form-control"
			name="date" placeholder="enter a date" value="<% out.print(t.getDate()); %>"> <br>
		 <input type="date" class="form-control"
			name="date" placeholder="enter a date"  value="<% out.print(t.getDate()); %>"> <br>
		  <select class="form-control" name="products">
		  <option value="" disabled selected hidden>enter a product id</option>
		    <%
		    Products p = new Products(); 
		    out.print(p.getproducts(t.getId()));
		    %>
		  </select>
		<br>
		<input type="number" class="form-control"
			name="total" placeholder="enter a total" value="<% out.print(t.getTotal()); %>"> <br>
		 <input
			type="submit" class="btn btn-primary float-right" value="Edit">
	</form>

</div>
<jsp:directive.include file = "../footer.jsp" />