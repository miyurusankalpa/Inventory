
<% Page.setTitle("Products Add");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product add");
		%>
	</h1>
	<br>
	<form action="/Inventory/product_addata" method="post">
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name"> <br>
		  <input type="number" class="form-control"
			name="qty" placeholder="enter a qty"> <br>
		 <input type="number" class="form-control"
			name="price" placeholder="enter a pricw"> <br>
		 <input
			type="submit" class="btn btn-primary" value="Add">
	</form>

</div>
</body>
</html>