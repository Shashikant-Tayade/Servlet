package in.happycoding.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.happycoding.bean.Student;

public class StudentDAO 
{
	private final String 	DATABASE_URL = "jdbc:mysql://localhost:3306/happycodingdb1";
	private final String 	USER         = "root";
	private final String  PASSWORD       = "root";
	
	public Student getByRollNumber(int roll_number) throws Exception
	{
		String query = "select * from stud where roll_number = ?";
		Student st = new Student();
		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, roll_number);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next())
			{
				st.setRoll_number(rs.getInt("roll_number"));
				st.setName(rs.getString("name"));
				st.setBirth_date(rs.getString("Birth_date"));
				st.setJoining_date(rs.getString("Joining_date"));
			}			
			
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
								
		return st;
		
		
	}
}
