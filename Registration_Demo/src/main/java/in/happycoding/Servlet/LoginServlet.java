package in.happycoding.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.happycoding.DAO.EmployeeDAO;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		boolean STATUS = employeeDAO.isValidUser(username, password);
		
		if(STATUS == true)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			response.sendRedirect("HomePage");
		}
		else
		{
			response.sendRedirect("login.html");
		}
	}
	

}
