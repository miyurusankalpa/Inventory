package Serverlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.Database;
import modals.Customers;

/**
 * Servlet implementation class Customers_Edit
 */
@WebServlet("/Customers_Edit")
public class Customers_Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customers_Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		
		Database c = new Database();

		Customers cu = new Customers();

		int d = Integer.parseInt(request.getParameter("id"));
		String n = request.getParameter("name");
		String a = request.getParameter("address");
		String e = request.getParameter("email");
		int co = Integer.parseInt(request.getParameter("contact"));
		
		cu.setId(d);
		cu.setName(n);
		cu.setAddress(a);
		cu.setEmail(e);
		cu.setContact(co);
		
		String query = cu.editquery();

		//out.println(query);c

		String result = c.adddata(query);
		
		session.setAttribute("result", result);
		
		//response.getWriter().append(result);
		
		response.sendRedirect("/Inventory/list/customers.jsp");
		
		//out.println(result);
	}

}
