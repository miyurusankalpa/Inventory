<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="test.Page"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>
	<%
		out.println(Page.getTitle());
	%>
</title>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="/Inventory/bootstrap/css/bootstrap.min.css">

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light"> <a
		class="navbar-brand" href="#"><img src="/Inventory/icon.svg"
		height="20px"></img> Inventory</a>
	<ul class="navbar-nav mr-auto">
		<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
		</li>
			<%
			if(session.getAttribute("loggedin") != null )	
			{
				out.print("<li class=\"nav-item\"><a class=\"nav-link\" href=\"dashboard.jsp\">Dashboard</a></li>");
			}
			%>
	</ul>
	<ul class="navbar-nav">
		<li class="nav-item">
		<%
		if(session.getAttribute("loggedin") == null )	
			{
				out.print("<a class=\"nav-link btn btn-outline-info\" href=\"login.jsp\">Login</a>");
			} 
				else 
			{
				out.print("<a class=\"nav-link btn btn-outline-info\" href=\"Logout\">Logout</a>");
			}
		%>
 		</li>
	</ul>
	</nav>

	<br />