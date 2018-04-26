
<% String pageTitle="Login";  %>
<jsp:directive.include file="header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("product add");
		%>
	</h1>
	<br>
	<form action="products_proccess.jsp" method="post">
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name"> <br>
		  <input type="text" class="form-control"
			name="qty" placeholder="enter a qty"> <br>
		 <input type="text" class="form-control"
			name="price" placeholder="enter a pricw"> <br>
		 <input
			type="submit" class="btn btn-primary" value="Add">
	</form>

</div>
</body>
</html>