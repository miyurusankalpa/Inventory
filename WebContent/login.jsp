
<% String pageTitle="Login";  %>
<jsp:directive.include file="header.jsp" />
<div class="container">
	<h1>
		<%
         out.println("Login to the System");
      %>
	</h1>
	<%

		if(session.getAttribute("result") != null )	{
			
			out.print("<div class=\"alert alert-warning\">");
			out.println(session.getAttribute("result"));
			session.removeAttribute("result");
			out.print("</div>");
			
		}
	%>
	<br>
	<p>use username test and password test to check login</p>
	<form action="Login" method="post">
		<input type="text" class="form-control"
			name="username" placeholder="enter a username"> <br>
		<input type="password" class="form-control"
			name="password" placeholder="enter a password"> <br> <input
			type="submit" class="btn btn-primary" value="Login">
	</form>

</div>
</body>
</html>