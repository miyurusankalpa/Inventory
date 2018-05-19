package Serverlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.test;
import test.Products;

/**
 * Servlet implementation class Products_Edit
 */
@WebServlet("/Products_Edit")
public class Products_Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Products_Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		HttpSession session = request.getSession(true);
		
		test c = new test();

		Products p = new Products();
		
		int i = Integer.parseInt(request.getParameter("id"));
		String n = request.getParameter("name");
		int q = Integer.parseInt(request.getParameter("qty"));
		int pr = Integer.parseInt(request.getParameter("price"));
		
		p.setId(i);
		p.setName(n);
		p.setQty(q);
		p.setPrice(pr);
		
		String query = p.editquery();

		//out.println(query);

		String result = c.adddata(query);
		
		session.setAttribute("result", result);
		
		//response.getWriter().append(result);
		
		response.sendRedirect("/Inventory/list/products.jsp");
		
		//out.println(result);
	}
	
	

}
