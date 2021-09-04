package in.happycoding.TestApp;

import in.happycoding.DAO.EmployeeDAO;
import in.happycoding.bean.Employee;

public class TestApp
{

	public static void main(String[] args) 
	{
		EmployeeDAO employeeDAO = new EmployeeDAO();

		boolean STATUS = employeeDAO.isValidUser("mitesh", "mitesh");
		
		if (STATUS == true)
		{
			System.out.println("Record Available");
		}
		else
		{
			System.out.println("Record is not Available");
		}
		
		

	}

}
