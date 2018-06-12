
<% Page.setTitle("Add Products");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Add Products");
		%>
	<a href="/Inventory/list/products.jsp" class="btn btn-lg align-right btn-info"><i class="fa fa-list"></i> list</a>
	</h1>
	<%
		if (session.getAttribute("result") != null) {

			out.print("<div class=\"alert alert-warning\">");
			out.println(session.getAttribute("result"));
			session.removeAttribute("result");
			out.print("</div>");

		}
	%>
	<br>
	<div class="card card-body bg-light">
	<form action="/Inventory/product_addata" method="post">
		<label>Name</label>
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name" required> <br>
		<label>Quantity</label>
		  <input type="number" class="form-control"
			name="qty" placeholder="enter a qty" required> <br>
		<label>Price</label>
		 <input type="number" class="form-control"
			name="price" placeholder="enter a price" required> <br>
		<button type="submit" class="btn btn-primary float-right" value="Add"><i class="fa fa-plus"></i> Add</button>
	</form>
 </div>
</div>
<jsp:directive.include file = "../footer.jsp" />