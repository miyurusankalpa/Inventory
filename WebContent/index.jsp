<%@page import="database.test"%>
<%
	Page.setTitle("Welcome");
%>
<jsp:directive.include file = "header.jsp" />
	  <div class="container text-center">
	  <h1>
      <%
      	out.println("Welcome to our Inventory Management System </br></br>");
      %>
      </h1>
      <div class="container"><div class="btn btn-primary btn-lg btn-block">Login</div></div>
	  </div>
<jsp:directive.include file = "footer.jsp" />