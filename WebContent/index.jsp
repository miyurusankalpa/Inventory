<%@page import="test.test"%>
<% String pageTitle="Hello World";  %>
<jsp:directive.include file = "header.jsp" />
	  <div class="container">
	  <h1>
      <%
      out.println("Hello World to the our system<br>");
      
      test tes = new test();
      out.println("SQL : "+tes.testc());
      	
      %></h1>
	  </div>
   </body>
</html>