package in.happycoding.bean;

public class Student 
{
	private int roll_number;
	private String name;
	private String Birth_date;
	private String Joining_date;
	
	
	public Student() 
	{
		super();
	}


	public Student(int roll_number, String name, String birth_date, String joining_date) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		Birth_date = birth_date;
		Joining_date = joining_date;
	}


	public int getRoll_number() {
		return roll_number;
	}


	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth_date() {
		return Birth_date;
	}


	public void setBirth_date(String birth_date) {
		Birth_date = birth_date;
	}


	public String getJoining_date() {
		return Joining_date;
	}


	public void setJoining_date(String joining_date) {
		Joining_date = joining_date;
	}


	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", Birth_date=" + Birth_date
				+ ", Joining_date=" + Joining_date + "]";
	}
	
	
	
	
}
