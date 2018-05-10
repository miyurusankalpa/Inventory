<%@page import="test.*"%>

<%
Page.setTitle("Customers");
%>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("customers details");
		%>
		<a href="add/customers.jsp" class="btn btn-lg align-right btn-info">add</a>
	</h1>
	<br>


	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th scope="col">#</th>
				<th scope="col">name</th>
				<th scope="col">address</th>
				<th scope="col">email</th>
				<th scope="col">contact</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>

			<%
				Customers cu = new Customers();

				out.print(cu.getdata());
			%>

		</tbody>
	</table>

</div>
</body>
</html>