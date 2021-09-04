package in.happycoding.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import in.happycoding.DAO.EmployeeDAO;
import in.happycoding.bean.Employee;


public class Registration extends HttpServlet 
{
	

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String _id = request.getParameter("id");
		String firstname = request.getParameter("firstname");
		String lastname= request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String _departmentId = request.getParameter("departmentId");
		
		PrintWriter writer = response.getWriter();
		
		if(_id.length() == 0 || firstname.length() == 0 || lastname.length() == 0 || username.length() ==  0 || password.length() ==  0  
				|| gender.length() ==  0 || _departmentId.length() ==  0)
		{
			writer.write("Provide Information : ");
		}
		else
		{
			
		EmployeeDAO dao = new EmployeeDAO();
		
		int id = Integer.parseInt(_id);
		int department_id = Integer.parseInt(_departmentId);
			
		Employee employee = new Employee(id, firstname, lastname, username, password, gender, department_id);
		
		
		try
		{
			dao.save(employee);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		response.sendRedirect("Success");
		}
	}

}
