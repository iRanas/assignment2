package classesInheritance;

public class UserManager {

	public void logIn(Student student) {
		System.out.println(student.getUserName() + " " + "kullanýcý giriþi baþarýlý.");

	}

	public void logIn(Instructor instructor) {
		System.out.println(instructor.getUserName() + " " + "kullanýcý giriþi baþarýlý.");

	}

	public void logOut(Student student) {

		System.out.println(student.getUserName() + " " + "kullanýcý çýkýþý yapýldý.");

	}

	public void logOut(Instructor instructor) {

		System.out.println(instructor.getUserName() + " " + "kullanýcý çýkýþý yapýldý.");

	}

}
