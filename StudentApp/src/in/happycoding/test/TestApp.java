package in.happycoding.test;

import java.util.List;

import in.happycoding.DAO.StudentDAO;
import in.happycoding.bean.Student;

public class TestApp 
{
	public static void main(String[] args) 
	{ 
		StudentDAO sd = new StudentDAO();
//		Student st = new Student(8,"Tara", "1/1/1998", "1/1/2020");
//		sd.save(st);
//		System.out.println("Record Saved ...");
		
		
//		sd.update(1, "pratha");
//		System.out.println("Upated Sucessfully...");
		
//		Student st = sd.getByRollNumber(8);
//		System.out.println(st);
//		
		
		List<Student> listOfStudent = sd.getAll();
		
		for (Student st : listOfStudent)
		{
			System.out.println(st);
		}
		
	}
	
	
}
