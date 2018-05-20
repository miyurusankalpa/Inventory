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
import modals.Products;
import modals.Transactions;

/**
 * Servlet implementation class Products_Edit
 */
@WebServlet("/Transactions_Edit")
public class Transactions_Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transactions_Edit() {
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
		
		Database c = new Database();

		Transactions t = new Transactions();
		
		int i = Integer.parseInt(request.getParameter("id"));
		Products p1 = new Products();
		Customers c1 = new Customers();
		
		String date = request.getParameter("date");
		int pid = Integer.parseInt(request.getParameter("products"));
		int cid = Integer.parseInt(request.getParameter("customers"));
		int tot = Integer.parseInt(request.getParameter("total"));

		t.setId(i);
		t.setDate(date);
		
		p1.setId(pid);
		t.setProduct(p1);
		
		c1.setId(cid);
		t.setCustomer(c1);
		
		t.setTotal(tot);
		
		String query = t.editquery();

		//out.println(query);

		String result = c.adddata(query);
		
		session.setAttribute("result", result);
		
		//response.getWriter().append(result);
		
		response.sendRedirect("/Inventory/list/transactions.jsp");
		
		//out.println(result);
	}
	
	

}
