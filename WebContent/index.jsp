<%@page import="database.test"%>
<%
	Page.setTitle("Welcome");
%>
<jsp:directive.include file = "header.jsp" />
	  <div class="container">
	  <h1>
      <%
      	out.println("Welcome to our Inventory Management System </br></br>");
            
            database.test tes = new database.test();
            out.println("SQL Server Status : "+tes.testc());
      %></h1>
	  </div>
   </body>
</html>