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
<link rel="shortcut icon" href="/Inventory/favicon.ico">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="/Inventory/bootstrap/css/bootstrap.min.css">
<link href="/Inventory/bootstrap/sticky-footer-navbar.css" rel="stylesheet">
<link rel="stylesheet" href="/Inventory/fontawesome/css/fontawesome-all.min.css">

</head>
<body>
 <header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary"> 
	<a
		class="navbar-brand" href="#">
		<img src="/Inventory/icon.svg"	height="20px" /> Inventory</a>
		<ul class="navbar-nav mr-auto">
		<li class="nav-item"><a class="nav-link text-white" href="/Inventory/index.jsp">Home</a>
		</li>
			<%
			if(session.getAttribute("loggedin") != null )	
			{
				out.print("<li class=\"nav-item\"><a class=\"nav-link text-white\" href=\"/Inventory/dashboard.jsp\">Dashboard</a></li>");
			}
			%>
	</ul>
	<ul class="navbar-nav">
		<li class="nav-item">
		<%
		if(session.getAttribute("loggedin") == null )	
			{
				out.print("<a class=\"nav-link btn btn-primary text-white\" href=\"/Inventory/login.jsp\">Login</a>");
			} 
				else 
			{
				out.print("<a class=\"nav-link btn btn-primary text-white\" href=\"/Inventory/Logout\">Logout</a>");
			}
		%>
 		</li>
	</ul>
	</nav>
 </header>
 <main role="main" class="container">
	<br />