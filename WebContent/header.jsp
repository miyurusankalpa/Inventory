<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>
	<%
		out.println(pageTitle);
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
			<!-- Should be only displayed when loggedin -->
		<li class="nav-item"><a class="nav-link" href="dashboard.jsp">Dashboard</a>
		</li>
	</ul>
	<ul class="navbar-nav">
			<!-- Should be only changed to logout out when looged in-->
		<li class="nav-item"><a class="nav-link btn btn-outline-info"
			href="login.jsp">Login</a></li>

	</ul>
	</nav>

	<br />