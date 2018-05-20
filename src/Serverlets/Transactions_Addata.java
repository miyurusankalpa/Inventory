package Serverlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.Database;
import modals.*;

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
				
				Database c = new Database();

				Transactions t = new Transactions();
				Products p1 = new Products();
				Customers c1 = new Customers();
				
				String date = request.getParameter("date");
				int pid = Integer.parseInt(request.getParameter("products"));
				int cid = Integer.parseInt(request.getParameter("customers"));
				int tot = Integer.parseInt(request.getParameter("total"));

				t.setDate(date);
				
				try {
					p1.getdatafromdb(pid);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				t.setProduct(p1);
				
				try {
					c1.getdatafromdb(cid);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				t.setCustomer(c1);
				
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
