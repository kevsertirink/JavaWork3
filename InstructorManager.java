package javaCamp3;



public class InstructorManager extends UserManager{
	
	public void AddInstructorCourses(Instructor instructor) {
		System.out.println(instructor.getInstructorCourses() + " isimli kurs eklendi");
	}

}