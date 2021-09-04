package in.happycoding.bean;

public class Employee 
{
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String gender;
	private int departmentId;
	
	
	public Employee() 
	{
		super();
	}


	public Employee(int id, String firstName, String lastName, String userName, String password, String gender,
			int departmentId) 
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.departmentId = departmentId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", gender=" + gender + ", departmentId=" + departmentId + "]";
	}
	
	
	
	
	
}
