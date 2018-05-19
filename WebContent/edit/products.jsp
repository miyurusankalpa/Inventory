<%@page import="test.*" %>
<% Page.setTitle("Edit Products");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product edit");
		%>
	<a href="/Inventory/list/product.jsp" class="btn btn-lg align-right btn-info">list</a>
	</h1>
	<%
		String s = request.getParameter("id");
		int i = Integer.parseInt(s);
		Products p = new Products(); 
		p.getdatafromdb(i);
		
	%>
	<br>
	<form action="/Inventory/Products_Edit" method="post">
	<input type="text" class="form-control"
			name="id" placeholder="id" value="<% out.print(p.getId()); %>" readonly> <br>
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name" value="<% out.print(p.getName()); %>"> <br>
		  <input type="number" class="form-control"
			name="qty" placeholder="enter a qty" value="<% out.print(p.getQty()); %>"> <br>
		 <input type="number" class="form-control"
			name="price" placeholder="enter a price" value="<% out.print(p.getPrice()); %>"> <br>
		 <input
			type="submit" class="btn btn-primary" value="Edit">
	</form>

</div>
<jsp:directive.include file = "../footer.jsp" />