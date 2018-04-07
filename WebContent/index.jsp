<%@page import="test.test"%>
<% String pageTitle="Hello World";  %>
<jsp:directive.include file = "header.jsp" />
	  <div class="container">
	  <h1>
      <%
      out.println("Welcome to our system<br>");
      
      test tes = new test();
      out.println("SQL status : "+tes.testc());
      	
      %></h1>
	  </div>
   </body>
</html>