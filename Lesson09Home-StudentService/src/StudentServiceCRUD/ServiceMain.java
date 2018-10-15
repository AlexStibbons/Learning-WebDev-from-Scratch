package StudentServiceCRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ServiceMain {
	
	private static ArrayList<Student> students = new ArrayList<>();
	private static ArrayList<Course> courses = new ArrayList<>();

	public static void main(String[] args) {
		
		//loadStudents();
		
		int choice = 0;
		
		Student a = new Student ("23", "Victor", "Frankenstein");
		Student b = new Student ("13", "Allan", "Poe");
		Student c = new Student ("56", "Locke", "Lamora");
		students.add(a);
		students.add(b);
		students.add(c);
		
		saveStudents();
		loadStudents();
		Course d = new Course("1", "Experimental Anthoropology", 6);
		Course e = new Course("2", "Exploratory Phisycs", 9);
		Course f = new Course("3", "Aritifice Design", 7);
		courses.add(d);
		courses.add(e);
		courses.add(f);

		do {
			
			showMenu();
			
			String userC = userInput();
			choice = Integer.parseInt(userC);
			
			System.out.println("You chose: " + choice);
			
			switch (choice) {
			
			case 1:
				listAllStudents();
				break;
			case 2:
				findStudent();
				break;
			case 3:
				importStudent();
				break;
			case 4:
				changeStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 6:
				listAllCourses();
				break;
			case 7:
				findCourseById();
				break;
			case 8:
				importCourse();
				break;
			case 9:
				changeCourse();
				break;
			case 10:
				deleteCourse();
				break;
			case 11:
				addStudentExam();
				break;
			case 12:
				deleteStudentExam();
				break;
			case 13:
				aboveGradeAverage();
				break;
			case 14:
				System.out.println("Thank you for using this service.");
				break;
			default:
				System.out.println("The choice you made is not in the menu. Please, choose again.");
			}
			
		} while (choice != 14);

		

	}
	

	//getting User input
	public static String userInput() {

		String s = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	private static void showMenu() {
		System.out.println();
		System.out.println("~~~~~Menu~~~~~");
		System.out.println("1. List All Students\n"
						+ "2. Find Student by Index Number\n"
						+ "3. Import Student\n"
						+ "4. Change Student\n"
						+ "5. Delete Student");
		System.out.println("6. List All Courses\n"
						+ "7. Find a Course by Course Id\n"
						+ "8. Import Course\n"
						+ "9. Change Course\n"
						+ "10. Delete Course\n"
						+ "11. Add Student's Exam\n"
						+ "12. Delete Student's Exam\n"
						+ "13. Find All Above a Grade Average\n"
						+ "14. Exit");
		System.out.println();
		System.out.println("Input choice:	");
	}
	
	public static void listAllStudents() {
		for (int i = 0; i < students.size(); i++) {
			students.get(i).printStudent();;
		}
	}
	
	public static void findStudent() { 
		// this can all be done in a more ELEGANT way
		// because there will be many times when the students are searched by index number
		// there can be a method that does just that - FINDS the student, and RETURNS the students.get(i)
		// that we can later use in another method
		// so instead of void, where everything's only printed
		// we'll have a method that RETURNS an object of the class Student
		// so it will look like `public static Student searchByIndex(){` etc.
		// so let's do that instead
		/*System.out.println("Input the student's index number: ");
		String ixNum = userInput();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getIndexNumber().equals(ixNum)) {
				students.get(i).printStudent();
			}
		}*/
		Student wantedStudent = findIndex();
		if (wantedStudent != null) {
			System.out.println("Is this the one?");
			wantedStudent.printStudent();
		} else {
			System.out.println("No such student in base. Try again.");
		}
	}
	
	public static Student findIndex() {
		System.out.println("Input the student's index number: ");
		String ixNum = userInput();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getIndexNumber().equalsIgnoreCase(ixNum)) {
				return students.get(i);
			}
		}
		return null;
	}
	
	public static void importStudent() {
		System.out.print("What is the new student's index number?");
		String newId = userInput();
		System.out.print("What is the new student's first name?	");
		String newName = userInput();
		System.out.print("What is the new student's last name?");
		String newLastName = userInput();
		Student e = new Student(newId, newName, newLastName);
		students.add(e);
		
		saveStudents();
		
		System.out.println();
		System.out.println("Updated list of students: ");
		listAllStudents();
		
		
	}

	public static void changeStudent() {
		
		/*System.out.print("Inpout the index number of the student you would like to change: ");
		String changeThis = userInput();*/
		Student toChange = findIndex();
		
		//here there can be another menu that asks what you want changed
		// case index number, case first name, case last name, case all
		
		System.out.println("New index number? ");
		String changedIndex = userInput();
		System.out.println("New first name? ");
		String changedFirstName = userInput();
		System.out.println("New last name? ");
		String changedLastName = userInput();
		
		//toChange.getIndexNumber() = changedIndex;
		toChange.setIndexNumber(changedIndex); //GO BACK AND CHECK WHY SETTER
		toChange.setFirstName(changedFirstName);
		toChange.setLastName(changedLastName);
		
		saveStudents();
		
		System.out.println();
		System.out.println("Updated list of students: ");
		listAllStudents();
		
	}
	
	public static void deleteStudent() {
		Student toDelete = findIndex();
		System.out.print("We are now deleting: ");
		toDelete.printStudent();
		students.remove(toDelete);
		
		saveStudents();
		
		System.out.println("Updated list:");
		listAllStudents();
	}
	
	public static void listAllCourses() {
		System.out.println("The courses are:");
		for (int i = 0; i < courses.size(); i++) {
			courses.get(i).printCourseData();
		}
	}
	
	public static void findCourseById() {
		
		Course wantedCourse = findCourseId();
		if (wantedCourse != null) {
			System.out.println("The wanted course is: "); wantedCourse.printCourseData();
		} else {
			System.out.println("No such course. Try again");
		}
		
	}
	
	public static Course findCourseId() { // why are we doing this?
		// because there will be many instances where the course ID
		// will be needed
		// so might as well make a method for it
		System.out.println("Please input course ID: ");
		String wantedId = userInput();
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getCourseId().equalsIgnoreCase(wantedId)) {
				return courses.get(i);
			}
		}
		return null;
	}
	
	public static void importCourse() {
		System.out.println("Importing course: ");
		System.out.println("Course id?");
		String addingCourseId = userInput();
		System.out.println("Course name?");
		String addingCourseName = userInput();
		System.out.println("Course points? [numerical value]");
		String addCoursePoints = userInput();
		int addingCoursePoints = Integer.parseInt(addCoursePoints);
		Course newCourse = new Course(addingCourseId, addingCourseName, addingCoursePoints);
		courses.add(newCourse);
		System.out.println("\nUpdated list of courses:");
		listAllCourses();
	}

	public static void changeCourse() {
		
		Course courseToChange = findCourseId();
		
		System.out.println("New id? ");
		String newCId = userInput();
		System.out.println("New name? ");
		String newCName = userInput();
		System.out.println("New points?");
		String newPointsS = userInput();
		int newPoints = Integer.parseInt(newPointsS);
		
		courseToChange.setCourseId(newCId);
		courseToChange.setCourseName(newCName);
		courseToChange.setCoursePoints(newPoints);
		
		System.out.println("Updated course list: ");
		listAllCourses();
	}

	public static void deleteCourse() {
		
		Course courseToDelete = findCourseId();
		
		courses.remove(courseToDelete);
		
		System.out.println("Updared list of courses: ");
		listAllCourses();
	}
	
	public static void addStudentExam() {
		Student student = findIndex();
		Course course = findCourseId();
	
		if (student != null && course != null ) {
			
			// getGrade is in separate method - why?
			System.out.print("Grade? ");
			String grade = userInput();
			int gradeInt = Integer.parseInt(grade);
			while (gradeInt <= 5) {
				System.out.println("Invalid grade. Input again:\n");
				grade = userInput();
				gradeInt = Integer.parseInt(grade);
			}
			
			Exam exam = new Exam(course, gradeInt);
			student.addExam(exam);
			//checking
			student.printStudent();

		} else {
			System.out.println("Nonexisting student or course.");
		}
	}
	
	private static void deleteStudentExam() {

		Student studentI = findIndex();
		Course course = findCourseId();
		
		studentI.deleteExam(course);
		
		studentI.printStudent();
		
	}
	
	private static void aboveGradeAverage() {
		System.out.println("Input the grade average: ");
		String avgA = userInput();
		double average = Double.parseDouble(avgA);
		// what i would do here is just print all the data
		// however, that means that that data can neither be exported nor accessed again
		// so in order to avoid this, all the students need to be put in a container of some sort
		// from where we can access it anytime we want
		// since it will be a list of objects
		// and then, a list with no limit or known limit
		// all these students need to be put in an ArrayList<Student> byGradeAverage
	}
	
	
	private static void saveStudents() {
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter("data/studenti.txt"));
			
//			for (int i = 0; i < studenti.size(); i++) {
//				Student student = studenti.get(i);
//				
//			}
			
			for (Student student : students) { // for-each petlja; iteriranje kroy kolekciju; nesto se radi svakom elementu
				pw.println(student.getIndexNumber() + ", " + student.getFirstName() + ", " + student.getLastName());
			}
			//for String s --> s.trim();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		
	}
	
	
	
	private static void loadStudents() {
		
		BufferedReader inputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("data/students.txt"));
			
			String line;
			
			while ( ( line = inputStream.readLine() ) != null) {
				
				String[] parts = line.split(",");
				
				Student s = new Student(parts[0], parts[1], parts[2]);
				students.add(s);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
					}
				}

			}

		}
}