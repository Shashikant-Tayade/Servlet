package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Arithmetic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter writer = response.getWriter();
		
		String _a = request.getParameter("a");
		String _b = request.getParameter("b");
		
		if(_a == null || _b == null)
		{
			writer.write("Enter the values of a and b : ");
		}
		else
		{
			int a = Integer.parseInt(_a);
			int b = Integer.parseInt(_b);
			
			int add = a + b ;
			int sub = a - b ;
			int mult= a * b ;
			int div = a / b ;
			
			writer.write("<br>");
			writer.write(a + " + " + b + " = " + add + "<br>");
			writer.write(a + " - " + b + " = " + sub + "<br>");
			writer.write(a + " * " + b + " = " + mult+ "<br>");
			writer.write(a + " / " + b + " = " + div + "<br>");
		}
		
		
	}

	
	
}
