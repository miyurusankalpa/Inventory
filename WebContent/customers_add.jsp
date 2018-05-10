
<% String pageTitle="Login";  %>
<jsp:directive.include file="header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product add");
		%>
	</h1>
	<br>
	<form action="/Inventory/customers_addata" method="post">
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name"> <br>
		  <input type="number" class="form-control"
			name="address" placeholder="enter a address"> <br>
		<input type="text" class="form-control"
			name="email" placeholder="enter a email"> <br>
		<input type="number" class="form-control"
			name="contact" placeholder="enter a contact"> <br>
		 <input
			type="submit" class="btn btn-primary" value="Add">
	</form>

</div>
</body>
</html>