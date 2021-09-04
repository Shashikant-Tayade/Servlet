package in.happycoding.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import in.happycoding.bean.Employee;

public class EmployeeDAO 
{
	private final String  DATABASE_URL = "jdbc:mysql://localhost:3306/dev_batch";
	private final String  USER         = "root";
	private final String  PASSWORD     = "root";
	
	
	public void save(Employee e) throws Exception
	{
		final String insert_query = "INSERT INTO employee VALUES(?,?,?,?,?,?,?)";
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			PreparedStatement pst = con.prepareStatement(insert_query);
			
			pst.setInt(1, e.getId());
			pst.setString(2, e.getFirstName());
			pst.setString(3, e.getLastName());
			pst.setString(4, e.getUserName());
			pst.setString(5, e.getPassword());
			pst.setString(6, e.getGender());
			pst.setInt(7, e.getDepartmentId());
			
			
			pst.execute();
			
		} 
		catch (Exception e2) 
		{
			System.out.println(e2.getMessage());
			
		}
	}


	
	
	public boolean isValidUser(String username, String password)
	{
		boolean STATUS = false;
		
		String query = "SELECT id FROM employee WHERE user_name = ? AND password = ?";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, username);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next())
			{
				STATUS = true;
				
			}
			
		} 
		catch (Exception e2) 
		{
			System.out.println(e2.getMessage());
			
		}
		
		
		return STATUS;
		
		
	}

}
