package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String _age  = request.getParameter("age");
		
		if(name == null || city == null || _age == null)
		{
			writer.write("Provide values : ");
		}
		else
		{
			int age = Integer.parseInt(_age);
			writer.write("<br>");
			writer.write("Name : "+ name + "<br>");
			writer.write("City : "+ city+ "<br>");
			writer.write("age : "+ age  + "<br>");
			
			writer.close();
		}
		
		
	}

}
