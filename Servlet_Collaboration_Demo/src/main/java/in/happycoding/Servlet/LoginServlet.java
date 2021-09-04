package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");        // to set the type to text or html or browser may show something wrong
		
		if (username.equals("admin") && password.equals("12345"))
		{
//			RequestDispatcher rd = request.getRequestDispatcher("HomeServlet");
//			rd.forward(request, response);
			
			HttpSession session = request.getSession();
			session.setAttribute("username", username);

			
			response.sendRedirect("HomeServlet");
			
		}
		else
		{
			PrintWriter writer = response.getWriter();
			writer.write("Invalid username / password");
//			RequestDispatcher rd = request.getRequestDispatcher("index.html");
//			rd.include(request, response);
			response.sendRedirect("index.html");
			
		}
	}

	

}
