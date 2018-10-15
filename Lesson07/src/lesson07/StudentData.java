package lesson07;

public class StudentData { //no main, bc this one does nothing but hold data
	
	// exercise 1 and 2
	String nameFirst;
	String nameLast;
	int indexNumber;
	
	//exercise 3
	String[] passedExams;
	int[] grades;
	String[] examPoints;
	
	void printStudentData() {
		System.out.println(indexNumber + " " + nameFirst + " " + nameLast);
	}
	
	// exercise 3
	void printStudentExams() {
		
		String examPassed = "Passed: ";
		String examGrades = "Grades: ";
		
		for (int i = 0; i < passedExams.length; i++) {
			examPassed += " " + passedExams[i] + " " + examPoints[i];
			examGrades += " " + grades[i];
			/*System.out.println("Passed: " + passedExams[i] + " " + examPoints[i] +
					", with the grade: " + grades[i]);*/
		}
		System.out.println(examPassed);
		System.out.println(examGrades);
		//System.out.println();
	}
	
	void printExamsIfGrade(int p) {
		
		//int p = 8;
		String examIf = "Passed exam with a grade equal or larger than " + p + ":\t";
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > 7) {
				examIf += "\n" + passedExams[i] + " " + examPoints[i];
				/*System.out.println("Passed exam with a grade equal or larger than " + 
						p + ":\t" + passedExams[i] + " " + examPoints[i]);*/
			}
		}
		System.out.println(examIf);
		
		
		//String x = "5 points";
		//int bodovi = Integer.valueOf(x.charAt(0));
		
		//System.out.println();
	}
	
	void printExamsIfPoints(int gradeLimit, int pointsLimit) {
		
		for (int i = 0; i < examPoints.length; i++) {
			int examPointsTrue = Integer.valueOf(examPoints[i].charAt(1));
			if (grades[i] > gradeLimit && examPointsTrue > pointsLimit) { //not working bc indexNumber is not an array, but a mere int
				System.out.println("\t exam with more than 8 and more than 9 " + passedExams[i]);
			}
		}
	}
	
	void gradeAverage() {
		
		double sum = 0;
		for (int i = 0; i < passedExams.length; i++) {
			sum += grades[i];
		}
		double avg = sum / passedExams.length;
		System.out.println("The average grade is " + avg);
		System.out.println();
	}
	
	// void method for Max grade
	// void method for Min grade
}
