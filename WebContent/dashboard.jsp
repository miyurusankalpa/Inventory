
<%
	String pageTitle = "Dashboard";
	boolean loggedin = true;
%>
<jsp:directive.include file="header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Welcome to the dashboard");
		%>
	</h1>
	<br>
	<div class="alert alert-success" role="alert">Login Successful</div>

	<div class="btn-group-lg">

		<a href="products.jsp" class="btn btn-info">products</a>
		 <a	href="customers.jsp" class="btn btn-success">customers</a>
		  <a href="transactions.jsp" class="btn btn-secondary">Transactions</a>

	</div>

</div>
</body>
</html>