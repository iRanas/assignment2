package classesInheritance;

public class Instructor extends User {
	
	private String userName;
	private String educationName;
	

	public Instructor(int id, String firstName, String lastName, String password,String educationName,String userName) {
		this.userName=userName;
		this.educationName = educationName;
	}
	
	

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		
	}
	
	
	

}
