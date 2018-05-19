<%
	Page.setTitle("Dashboard");
%>
<jsp:directive.include file="header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Welcome to the dashboard");
		%>
	</h1>
	<br>
	<%

		if(session.getAttribute("result") != null )	{
			
			out.print("<div class=\"alert alert-success\">");
			out.println(session.getAttribute("result"));
			session.removeAttribute("result");
			out.print("</div>");
			
		}
	%>

	<div>
		<a href="list/products.jsp" class="btn btn-info btn-lg btn-block"><i class="fa fa-box"></i> Products</a>
		<a href="list/customers.jsp" class="btn btn-success btn-lg btn-block"><i class="fa fa-user"></i> Customers</a>
		<a href="list/transactions.jsp" class="btn btn-dark btn-lg btn-block"><i class="fa fa-list-alt"></i> Transactions</a>
	</div>

</div>
<jsp:directive.include file = "footer.jsp" />