
<% Page.setTitle("Edit Products");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product edit");
		%>
	<a href="/Inventory/list/product.jsp" class="btn btn-lg align-right btn-info">list</a>
	</h1>
	
	<br>
	<form action="/Inventory/Products_Edit" method="post">
	<input type="text" class="form-control"
			name="id" placeholder="id" readonly> <br>
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name"> <br>
		  <input type="number" class="form-control"
			name="qty" placeholder="enter a qty"> <br>
		 <input type="number" class="form-control"
			name="price" placeholder="enter a pricw"> <br>
		 <input
			type="submit" class="btn btn-primary" value="Edit">
	</form>

</div>
<jsp:directive.include file = "../footer.jsp" />