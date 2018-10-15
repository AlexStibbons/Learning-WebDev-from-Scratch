package StudentServiceCRUD;

public class Exam {
	
	private int grade;
	private Course course;
	
	//toString() is a textual description of the object [created by the class blueprint/ ~= class instance]
	//why should we use toString() in this one?
	
	/*public Exam() {
	}*/
	
	
	
	public Exam(Course course, int grade) {
		this.course = course;
		this.grade = grade;
	}

	/*@Override
	public String toString() {
		return "Exam [grade=" + grade + ", course=" + course + "]";
	}*/

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
