package classesInheritance;

public class Student extends User {
	
	private String userName;
	private String courseName;

	public Student(int id, String firstName, String lastName, String password,String courseName, String userName) {
		this.userName=userName;
		this.courseName = courseName;
	}
	
	

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
}
