package javaCamp3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId("1");
		student1.setName("Ahmet");
		student1.setSurName("Demir");
		student1.setCourses("Java Kursu");
		
		Student student2 = new Student();
		student2.setId("2");
		student2.setName("Ali");
		student2.setSurName("Demir");
		student2.setCourses("Java Kursu");
		
		Instructor instructor = new Instructor();
		instructor.setId("1");
		instructor.setName("Engin");
		instructor.setSurName("Demirog");
		instructor.setInstructorCourses("Java");
		
		Student [ ] students = {student1,student2};
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student1);
		studentManager.AddCourse(student1);
		studentManager.AddMultiple(students);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.AddInstructorCourses(instructor);
		instructorManager.Add(instructor);
		
		
	}

}