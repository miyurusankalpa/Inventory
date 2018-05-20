<%@page import="modals.*"%>

<% Page.setTitle("Transactions"); %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("transactions details");
		%>
		<a href="/Inventory/add/transactions.jsp" class="btn btn-lg align-right btn-info">add</a>
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
				<th scope="col">date</th>
				<th scope="col">products</th>
				<th scope="col">customer</th>
				<th scope="col">total</th>
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
		<%
				Transactions t = new Transactions();

				out.print(t.getdata());
			%>
		</tbody>
	</table>

</div>
<jsp:directive.include file = "../footer.jsp" />