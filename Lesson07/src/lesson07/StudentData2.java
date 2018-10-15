package lesson07;

public class StudentData2 {
	
	String nameFirst1;
	String nameLast1;
	int indexNumber1;
	
	String[] passedExams1; // thia should connect to the objects made from ExamData2 class
	int[] grades1;
	int[] examPoints1;
	
	ExamData[] passed;
	
	void printFromExamData() {
		for (int i = 0; i < passed.length; i++) {
		System.out.print("From class ExamData: " + passed[i].examName + " " + passed[i].examPoints + "\n");
		System.out.print("Exam data is: "); passed[i].printExamData();
		}
	}
	
	
	void printStudentData2() {
		System.out.println(indexNumber1 + " " + nameFirst1 + " " + nameLast1);
	}
	
	// exercise 3
	void printStudentExams2() {
		
		String examPassed1 = "Passed: "; //all you need is a print Passed right above the loop. not all this -_-
		String examGrades1 = "Grades: ";
		
		for (int i = 0; i < passedExams1.length; i++) {
			examPassed1 += " " + passedExams1[i] + " " + examPoints1[i];
			examGrades1 += " " + grades1[i];
			/*System.out.println("Passed: " + passedExams[i] + " " + examPoints[i] +
					", with the grade: " + grades[i]);*/
		}
		System.out.println(examPassed1);
		System.out.println(examGrades1);
		//System.out.println();
	}
	
	void printExamsIfGrade2(int p) {
		
		//int p = 8;
		String examIf1 = "Passed exam with a grade equal or larger than " + p + ":\t";
		for (int i = 0; i < grades1.length; i++) {
			if (grades1[i] > 7) {
				examIf1 += "\n" + passedExams1[i] + " " + examPoints1[i];
				/*System.out.println("Passed exam with a grade equal or larger than " + 
						p + ":\t" + passedExams[i] + " " + examPoints[i]);*/
			}
		}
		System.out.println(examIf1);
		//System.out.println();
	}
	
	/*void printExamsIfPoints() {
		
		for (int i = 0; i < examPoints.length; i++) {
			if (grades[i] > 8 && indexNumber[i] > 3000) { //not working bc indexNumber is not an array, but a mere int
				System.out.println("\t exam with more than 8 and more than 10 " + passedExams[i]);
			}
		}
	}*/
	
	void gradeAverage2() {
		
		
		double sum = 0;
		for (int i = 0; i < passedExams1.length; i++) {
			sum += grades1[i];
		}
		double avg = sum / passedExams1.length;
		System.out.println("The average grade is " + avg);
		System.out.println();
	}
	
	// void method for Max grade
	// void method for Min grade
}
