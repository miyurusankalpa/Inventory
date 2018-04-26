<%@page import="test.*"%>

<%
	String pageTitle = "Dashboard";
%>
<jsp:directive.include file="header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product details");
		%>
		<a href="products_add.jsp" class="btn btn-lg align-right btn-info">add</a>
	</h1>
	<br>
	
	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th scope="col">#</th>
				<th scope="col">name</th>
				<th scope="col">qty</th>
				<th scope="col">price</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>Mark</td>
				<td>Otto</td>
				<td>@mdo</td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
			</tr>
			<tr>
			<% 
			test c = new test();

			Products p = new Products();
			
			out.print(p.getdata());
			%>
			</tr>
		</tbody>
	</table>

</div>
</body>
</html>