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
		String tname  = request.getParameter("table");
		
		HttpSession session = request.getSession(true);
		
		test con = new test();
		
		String query = null;
		
		if(tname.equals("product"))
		{
			Products p = new Products();
			p.setId(id);
			query = p.deletequery();
			con.adddata(query);
		}
		
		if(tname.equals("customers"))
		{
			Customers c = new Customers();
			c.setId(id);
			query = c.deletequery();
			con.adddata(query);
		}
		
		if(tname.equals("transactions"))
		{
			Transactions t = new Transactions();
			t.setId(id);
			query = t.deletequery();
			con.adddata(query);
		} 
		
		
	//String result = con.adddata(query);
		
		session.setAttribute("result", "success delete data");
		
		
		response.sendRedirect("/Inventory/list/"+tname+".jsp");
	}

}
