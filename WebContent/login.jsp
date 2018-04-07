
<% String pageTitle="Login";  %>
<jsp:directive.include file="header.jsp" />
<div class="container">
	<h1>
		<%
         out.println("Login to the System");
      %>
	</h1>
	<br>
	<form action="dashboard.jsp" method="post">
		<input type="text" class="form-control"
			name="username" placeholder="enter a username"> <br>
		<input type="password" class="form-control"
			name="password" placeholder="enter a password"> <br> <input
			type="submit" class="btn btn-primary" value="Login">
	</form>

</div>
</body>
</html>