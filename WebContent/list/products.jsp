<%@page import="modals.*"%>

<%
Page.setTitle("Products");
%>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product details");
		%>
		<a href="/Inventory/add/products.jsp" class="btn btn-lg align-right btn-info">add</a>
	</h1>
	<br>

	<%
		if (session.getAttribute("result") != null) {

			out.print("<div class=\"alert alert-success\">");
			out.println(session.getAttribute("result"));
			session.removeAttribute("result");
			out.print("</div>");

		}
	%>

	<table class="table table-hover table-bordered text-center">
		<thead class="thead-dark">
			<tr>
				<th scope="col">#</th>
				<th scope="col">name</th>
				<th scope="col">qty</th>
				<th scope="col">price</th>
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<%
				Products p = new Products();

				out.print(p.getdata());
			%>
		</tbody>
	</table>

</div>
<jsp:directive.include file = "../footer.jsp" />