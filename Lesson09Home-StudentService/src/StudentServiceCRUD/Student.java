package StudentServiceCRUD;

import java.util.ArrayList;

public class Student {
	
	private String firstName;
	private String lastName;
	private String indexNumber;
	// every student has an array list[!!] of courses; they can have an infinite number of passed exams
	// therefore the list needed is not a never-changing array
	// but an ARRAYLIST
	private ArrayList<Exam> exams = new ArrayList<Exam>();
	
	public Student() {
	}
	
	public Student(String indexNumber, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.indexNumber = indexNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}
	
	
	////////////////////////////////////////
	
	
	//why only void? why not private or public?
	// private means it's available to this class only, which isn't what we want
	// public means it's available to any class, which is fine, though inconvenient
	// undeclared [in this case, void only] means that only the classes in this package
	// have access to this particular method - which is the best option
	void printStudent() {
		String toPrint = indexNumber + " " + firstName + " " + lastName + " Passed:\n";
		for (int i = 0; i < exams.size(); i++) {
			toPrint += " " + exams.get(i).getCourse().getCourseName() + " " + exams.get(i).getGrade() + "\n";
		}
		System.out.println(toPrint);
	}
	
	public Exam findExamByCourse(Course course) { //this is to check if the added exam is already here
		for (int i = 0; i < exams.size(); i++) {
			if ( (exams.get(i).getCourse().getCourseId()).equals(course.getCourseId()) ) {
				return exams.get(i);
			}
		}
		return null;
	}
	
	void addExam(Exam exam) {
		// check to see if the exam is not in the student's exams array list
		// do that by comparing the course of the exam we want to add [which we get when making the exam object]
		// to the courses that exist within the student's exam array
		if (findExamByCourse(exam.getCourse()) == null) {
			exams.add(exam);
			return;
		}
		
		System.out.print("Student passed the exam already.");
	}
	
	void deleteExam(Course course) {
		int examIndex = -1;
		for (int i = 0; i < exams.size(); i++) {
			if ( (exams.get(i).getCourse().getCourseId()).equals(course.getCourseId()) ) {
				examIndex = i;
			}
		}
		exams.remove(examIndex);
	}
	
	
	double gradeAverage() {
		double sum = 0;
		for (int i = 0; i < exams.size(); i++) {
			sum += exams.get(i).getGrade();
		}
		double avg = sum / exams.size();
		return avg;
	}
	
	

}
