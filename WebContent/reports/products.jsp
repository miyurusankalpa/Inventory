<%@page import="modals.*"%>

<%
Page.setTitle("Products Report");
%>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Products Report");
		
		String s = request.getParameter("id");
		
		Reports r = new Reports();
		Products p = new Products();
		
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
				<th scope="col">Customers</th>
				<th scope="col">addy</th>
				<th scope="col">total</th>
			</tr>
		</thead>
		<tbody>
			<%
				int i = Integer.parseInt(s);
			
				out.print(r.productReport(i));
			%>
		</tbody>
	</table>

</div>
<jsp:directive.include file = "../footer.jsp" />