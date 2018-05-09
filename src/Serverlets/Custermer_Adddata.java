package Serverlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.Custermer;
import test.Products;
import test.test;

/**
 * Servlet implementation class Custermer_Adddata
 */
@WebServlet("/Custermer_Adddata")
public class Custermer_Adddata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Custermer_Adddata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
				HttpSession session = request.getSession(true);
				
				test c = new test();

				Custermer cu = new Custermer();

				String n = request.getParameter("name");
				String a = request.getParameter("address");
				String e = request.getParameter("email");
				int co = Integer.parseInt(request.getParameter("contact"));
				
				
				cu.setName(n);
				cu.setAddress(a);
				cu.setEmail(e);
				cu.setContact(co);
				
				String query = cu.createquery();

				//out.println(query);c

				String result = c.adddata(query);
				
				session.setAttribute("result", result);
				
				//response.getWriter().append(result);
				
				response.sendRedirect("/Inventory/custermer.jsp");
				
				//out.println(result);
				
			}
}
