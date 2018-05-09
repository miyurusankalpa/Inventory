package Serverlets;

import test.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		User u = new User();
		
		if(u.checkLogin(user, pass))
		{
			session.setAttribute("result", "Success");
			
			response.sendRedirect("/Inventory/dashboard.jsp");
		} else {
			session.setAttribute("result", "Error");
			
			response.sendRedirect("/Inventory/login.jsp");
		}
		
	}

}
