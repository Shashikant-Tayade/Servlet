package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter writer = response.getWriter();
		writer.write("<h2> Welcome to India </h2>");      //  used to print on server
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		
		writer.write("Name  : "+ name + "<br>");
		writer.write("City : "+  city + "<br>");
		
		writer.close();
		
	}

}
