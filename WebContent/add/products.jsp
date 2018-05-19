
<% Page.setTitle("Add Products");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product add");
		%>
	<a href="/Inventory/list/product.jsp" class="btn btn-lg align-right btn-info">list</a>
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
<jsp:directive.include file = "../footer.jsp" />