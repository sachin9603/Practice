package studentManagementSystem.model;

public class Course {
	

//CREATE TABLE course (
//    courseId INT primary key ,
//    courseName VARCHAR(225)
//);

	private Integer courseId ;
	private String courseName  ;
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Course(Integer courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public  Course() {}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}  ;
	
	
	
	

}
