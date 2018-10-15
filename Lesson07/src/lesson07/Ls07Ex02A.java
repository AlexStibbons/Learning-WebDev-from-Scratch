package lesson07;

public class Ls07Ex02A {

	public static void main(String[] args) {
		ExamData exam1 = new ExamData();
		exam1.examId = 1;
		exam1.examName = "Anatomy of a foot";
		exam1.examPoints = 10;
		//exam1.printExamData();
		
		ExamData exam2 = new ExamData();
		exam2.examId = 12;
		exam2.examName = "Root plants";
		exam2.examPoints = 6;
		//exam2.printExamData();
		
		ExamData exam3 = new ExamData();
		exam3.examId = 13;
		exam3.examName = "Falling into pits";
		exam3.examPoints = 3;
		//exam3.printExamData();
		
		ExamData exam4 = new ExamData();
		exam4.examId = 14;
		exam4.examName = "Billowing coats";
		exam4.examPoints = 9;
		//exam4.printExamData();
		
		//*******************************************************************

		StudentData2 st1 = new StudentData2();
		st1.nameFirst1 = "Samwise";
		st1.nameLast1 = "Something";
		st1.indexNumber1 = 13;
		
		st1.passed = new ExamData[] {exam4, exam2};
		
		st1.printStudentData2();
		st1.printFromExamData();

	}

}
