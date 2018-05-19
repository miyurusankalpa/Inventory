package Serverlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.test;
import test.*;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id  = Integer.parseInt(request.getParameter("id"));
		String t  = request.getParameter("table");
		
		HttpSession session = request.getSession(true);
		
		test c = new test();
		
		String query;
		
		if(t.equals("product"))
		{
			Products p = new Products();
			p.setId(id);
			query = p.deletequery();
		}
		
		if(t.equals("customers"))
		{
			Customers c = new Customers();
			c.setId(id);
			query = c.deletequery();
		} 
		
		if(t.equals("transactions"))
		{
			Transactions t = new Transactions();
			t.setId(id);
			query = t.deletequery();
		} 
		
		
		String result = c.adddata(query);
		
		session.setAttribute("result", "success delete data");
		
		//response.getWriter().append(result);
		
		response.sendRedirect("/Inventory/list/"+t+".jsp");
	}

}
