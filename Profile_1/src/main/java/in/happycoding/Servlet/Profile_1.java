package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import in.happycoding.DAO.StudentDAO;
import in.happycoding.bean.Student;


public class Profile_1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter writer = response.getWriter();
		
		String _roll_number = request.getParameter("roll_number");		
		Student st = new Student();
		
		if(_roll_number == null)
		{
			writer.write("Provide roll_number : ");
		}
		else
		{
			int roll_number = Integer.parseInt(_roll_number);
			
			StudentDAO sd = new StudentDAO();					
			
				
				try 
				{
					st = sd.getByRollNumber(roll_number);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				writer.write("<br>");
				writer.write("Roll No : "+st.getRoll_number() + "<br>");
				writer.write("Name : "+ st.getName() + "<br>");
				writer.write("DOB : "+ st.getBirth_date() + "<br>");
				writer.write("DOJ : "+ st.getJoining_date() + "<br>");
												
		}
		
	}


}
