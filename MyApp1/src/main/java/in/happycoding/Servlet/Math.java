package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Math extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		
		
		PrintWriter writer = response.getWriter();
		String _a = request.getParameter("a");
		
		if(_a == null)
		{
			writer.write("Enter the value of a : ");
		}
		else
		{
			int a = Integer.parseInt(_a);
			
			int sq = a * a;
			int cube = a * a * a;
			writer.write("Square : "+ sq + "<br>");
			writer.write("Cube : "  + cube+"<br>");
			for (int i = 1; i <= 10; i++) 
			{
				int t = a * i;
				writer.write(t + "<br>");
				
			}
			
		}
		
	}

}
