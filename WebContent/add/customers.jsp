<% Page.setTitle("Add Customers");  %>
<jsp:directive.include file="../header.jsp" />
<div class="container">
	<h1>
		<%
			out.println("Add Customers");
		%>
	<a href="/Inventory/list/customers.jsp" class="btn btn-lg align-right btn-info"><i class="fa fa-list"></i> list</a>
	</h1>
	
	<br>
	<div class="card card-body bg-light">
	<form action="/Inventory/customers_addata" method="post">
		<label>Name</label>
		 <input type="text" class="form-control"
			name="name" placeholder="enter a name" required> <br>
			<label>Address</label>
		  <input type="text" class="form-control"
			name="address" placeholder="enter a address" required> <br>
			<label>Email</label>
		<input type="text" class="form-control"
			name="email" placeholder="enter a email" required required pattern="[^@]+@[^@]+\.[a-zA-Z]{2,6}"> <br>
			<label>Contact Number</label>
		<input type="number" class="form-control"
			name="contact" placeholder="enter a contact" required> <br>
		 <button type="submit" class="btn btn-primary float-right" value="Add"><i class="fa fa-plus"></i> Add</button>
	</form>
</div> 
</div>
<jsp:directive.include file = "../footer.jsp" />