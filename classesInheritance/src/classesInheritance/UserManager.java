package classesInheritance;

public class UserManager {

	public void logIn(Student student) {
		System.out.println(student.getUserName() + " " + "kullan�c� giri�i ba�ar�l�.");

	}

	public void logIn(Instructor instructor) {
		System.out.println(instructor.getUserName() + " " + "kullan�c� giri�i ba�ar�l�.");

	}

	public void logOut(Student student) {

		System.out.println(student.getUserName() + " " + "kullan�c� ��k��� yap�ld�.");

	}

	public void logOut(Instructor instructor) {

		System.out.println(instructor.getUserName() + " " + "kullan�c� ��k��� yap�ld�.");

	}

}
