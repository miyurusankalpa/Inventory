<%@page import="database.Database"%>
<%
	Page.setTitle("Inventory Home");
%>
<jsp:directive.include file = "header.jsp" />
	  <div class="container text-center">
	  <h1>
      <%
      	out.println("Welcome to our Inventory Management System </br></br>");
      %>
      </h1>
      <div class="container"><a href="/Inventory/login.jsp" class="btn btn-primary btn-lg btn-block"><i class="fa fa-arrow-right"></i> Login</a></div>
	  </div>
<jsp:directive.include file = "footer.jsp" />