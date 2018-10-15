package StudentServiceCRUD;

public class Course {
	
	private String courseId;
	private String courseName;
	private int coursePoints;
	
	public Course() {
		
	}

	public Course(String courseId, String courseName, int coursePoints) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePoints = coursePoints;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCoursePoints() {
		return coursePoints;
	}

	public void setCoursePoints(int coursePoints) {
		this.coursePoints = coursePoints;
	}
	
	///////////////////////////////////////
	
	public void printCourseData() {
		System.out.println(this.courseId + " " + this.courseName + " (" + this.coursePoints + " points)");
	}
}
