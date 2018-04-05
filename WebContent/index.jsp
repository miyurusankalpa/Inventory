<%@page import="test.test"%>
<% String pageTitle="Hello World";  %>
<jsp:directive.include file = "header.jsp" />
	  <div class="container">
	  <h1>
      <%
      out.println("Hello World 2 <br>");
      
      test tes = new test();
      out.println("SQL : "+tes.testc());
      	
      %></h1>
	  </div>
   </body>
</html>