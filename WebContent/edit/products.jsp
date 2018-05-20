<%@page import="modals.*" %>
<% Page.setTitle("Edit Products");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Edit Products");
		%>
	<a href="/Inventory/list/product.jsp" class="btn btn-lg align-right btn-info"><i class="fa fa-list"></i> list</a>
	</h1><br>
	<%
		String s = request.getParameter("id");
		Products p = new Products();
		
		if (s == null)
			out.print("<h3 class=\"alert alert-danger\">Empty ID</h3>");
		else {
			int i = Integer.parseInt(s);
			p.getdatafromdb(i);
		}
	%>
	<div class="card card-body bg-light">
	<form action="/Inventory/Products_Edit" method="post">
	<label>ID</label>
	<input type="text" class="form-control"
			name="id" placeholder="id" value="<% out.print(p.getId()); %>" readonly> <br>
	<label>Name</label>
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name" value="<% out.print(p.getName()); %>"> <br>
	<label>Quantity</label>
		  <input type="number" class="form-control"
			name="qty" placeholder="enter a qty" value="<% out.print(p.getQty()); %>"> <br>
	<label>Price</label>
		 <input type="number" class="form-control"
			name="price" placeholder="enter a price" value="<% out.print(p.getPrice()); %>"> <br>
		 <button type="submit" class="btn btn-primary float-right" value="Add"><i class="fa fa-save"></i> Save</button>
	</form>
</div>
</div>
<jsp:directive.include file = "../footer.jsp" />