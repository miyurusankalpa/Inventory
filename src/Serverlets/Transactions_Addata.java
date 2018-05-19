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
 * Servlet implementation class customers_Adddata
 */
@WebServlet("/transactions_addata")
public class Transactions_Addata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transactions_Addata() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				HttpSession session = request.getSession(true);
				
				test c = new test();

				Transactions t = new Transactions();

				String date = request.getParameter("date");
				int pid = Integer.parseInt(request.getParameter("products"));
				int tot = Integer.parseInt(request.getParameter("total"));
				
				
				t.setDate(date);
				t.setProducts(pid);
				t.setTotal(tot);
				
				String query = t.createquery();

				//out.println(query);c

				String result = c.adddata(query);
				
				session.setAttribute("result", result);
				
				//response.getWriter().append(result);
				
				response.sendRedirect("/Inventory/list/transactions.jsp");
				
				//out.println(result);
				
			}
}