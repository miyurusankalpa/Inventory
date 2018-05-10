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
		 <input type="text" class="form-control"
			name="date" placeholder="enter a date"> <br>
		  <input type="text" class="form-control"
			name="products" placeholder="enter a product id"> <br>
		<input type="number" class="form-control"
			name="total" placeholder="enter a total"> <br>
		 <input
			type="submit" class="btn btn-primary" value="Add">
	</form>

</div>
</body>
</html>