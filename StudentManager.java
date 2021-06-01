package javaCamp3;

public class StudentManager extends UserManager {
	
	public void AddCourse(Student student) {
		System.out.println(student.getCourses() + " isimli kurs eklendi");
	}

}