package classesInheritance;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Rana","�ensoy","Java","123", "Rana1");
		
		
		Instructor instructor = new Instructor(2,"Engin","Demiro�","456","Java","Engin2");
		 
		
		
		
		 
		StudentManager studentManager = new StudentManager();
		studentManager.update(student);
		
		
		UserManager userManager = new UserManager();
		userManager.logIn(student);
		userManager.logIn(instructor);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
