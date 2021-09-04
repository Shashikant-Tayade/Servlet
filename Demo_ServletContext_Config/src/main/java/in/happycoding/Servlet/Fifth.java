 package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Fifth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		String schoolname = context.getInitParameter("School name");
		
		
		ServletConfig config = getServletConfig();
		String classteacher = config.getInitParameter("Class Teacher");
		PrintWriter writer = response.getWriter();
		writer.write("<h3> School Name : "+ schoolname +"</h3>");
		writer.write("<h3> Class Teacher Name : "+ classteacher +"</h3>");
		
	}

}
