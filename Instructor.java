package javaCamp3;

public class Instructor extends User{
	
	private String instructorCourses;
	
	public Instructor() {
		
	} 
	

	public Instructor(String instructorCourses) {
		this.instructorCourses = instructorCourses;
	}


	public String getInstructorCourses() {
		return instructorCourses;
	}

	public void setInstructorCourses(String instructorCourses) {
		this.instructorCourses = instructorCourses;
	}
	
}
