<%@page import="modals.*"%>

<%
Page.setTitle("Customer Report");
%>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Customer Report - ");
		
		String s = request.getParameter("id");
		
		Reports r = new Reports();
		Customers c = new Customers();
		
		int i = Integer.parseInt(s);
		
		c.getdatafromdb(i);
		
		out.println(c.getName());
		
		if (s == null)
			out.print("<h3 class=\"alert alert-danger\">Empty ID</h3>");
		else {
			//int i = Integer.parseInt(s);
			//r.productReport(i);
		}
	%>
	</h1>
	<br>

	<table class="table table-hover table-bordered text-center">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Product</th>
				<th scope="col">Price</th>
				<th scope="col">Total</th>
			</tr>
		</thead>
		<tbody>
			<%
				//int i = Integer.parseInt(s);
			
				out.print(r.productCustomer(i));
			%>
		</tbody>
	</table>

</div>
<jsp:directive.include file = "../footer.jsp" />