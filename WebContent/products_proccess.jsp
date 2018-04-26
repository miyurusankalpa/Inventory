<%@page import="test.*"%>

<% 

test c = new test();

Products p = new Products();


p.setName("test121");
p.setQty(2);
p.setPrice(200);
String query = p.createquery();

//out.println(query);

String result = c.adddata(query);
out.println(result);

%>