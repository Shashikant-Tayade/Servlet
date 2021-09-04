package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		PrintWriter writer = response.getWriter();
		
//		String username = request.getParameter("username");
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		
		writer.write("<h2> Home Page Of "+username + "</h2>");
		
	}

}
