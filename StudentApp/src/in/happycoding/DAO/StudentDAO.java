package in.happycoding.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.happycoding.bean.Student;

public class StudentDAO 
{
	
	private final String DATABASE_URL = "jdbc:mysql://localhost:3306/happycodingdb1";
	private final String USER = "root";
	private final String PASSWORD = "root";
	
	public void save (Student s)
	{
		String query = "insert into stud values (?,?,?,?);";
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, s.getRoll_number());
			pst.setString(2, s.getName());
			pst.setString(3, s.getBirth_date());
			pst.setString(4, s.getJoining_date());
			
			pst.execute();
					
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void update (int roll_number, String name)
	{
		String query = "update stud set name = ? where roll_number = ?";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, name);
			pst.setInt(2, roll_number);
			
			pst.execute();
			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public Student getByRollNumber(int roll_number)
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
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
			
		return st;
		
	}
	
	public List<Student> getAll()
	{
		
		List<Student>listOfStudent = new ArrayList<Student>();
		
		String query = "select * from stud";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next())
			{
				
				Student st = new Student();
				
				st.setRoll_number(rs.getInt("roll_number"));
				st.setName(rs.getString("name"));
				st.setBirth_date(rs.getString("Birth_date"));
				st.setJoining_date(rs.getString("Joining_date"));
				
				listOfStudent.add(st);
			}
			
			
			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		return listOfStudent;
				
	}
	
}
