package lesson07;

public class Ls07Ex02 {

	public static void main(String[] args) {
		
		ExamData exam1 = new ExamData();
		exam1.examId = 1;
		exam1.examName = "Anatomy of a foot";
		exam1.examPoints = 10;
		exam1.printExamData();
		
		ExamData exam2 = new ExamData();
		exam2.examId = 12;
		exam2.examName = "Root plants";
		exam2.examPoints = 6;
		exam2.printExamData();
		
		ExamData exam3 = new ExamData();
		exam3.examId = 13;
		exam3.examName = "Falling into pits";
		exam3.examPoints = 3;
		exam3.printExamData();
		
		ExamData exam4 = new ExamData();
		exam4.examId = 14;
		exam4.examName = "Billowing coats";
		exam4.examPoints = 9;
		exam4.printExamData();
		
		//*******************************************************************

		StudentData2 st1 = new StudentData2();
		st1.nameFirst1 = "Samwise";
		st1.nameLast1 = "Something";
		st1.indexNumber1 = 13;
		st1.passedExams1 = new String[] {"Root plants", "Basics of Cookery"};
		st1.examPoints1 = new int[] {6, 8};
		st1.grades1 = new int[] {6, 9};
		
		StudentData2 st2 = new StudentData2();
		st2.nameFirst1 = "Bilbo";
		st2.nameLast1 = "Baggins";
		st2.indexNumber1 = 18;
		st2.passedExams1 = new String[] {"Anatomy of a foot"};
		st2.examPoints1 = new int[] {10};
		st2.grades1 = new int[] {7};
		
		StudentData2 st3 = new StudentData2();
		st3.nameFirst1 = "Gandalf";
		st3.nameLast1 = "the Grey";
		st3.indexNumber1 = 17;
		st3.passedExams1 = new String[] {"Wizardry", "Falling into pits"};
		st3.examPoints1 = new int[] {7, 3};
		st3.grades1 = new int[] {10, 10};
		
		StudentData2 st4 = new StudentData2();
		st4.nameFirst1 = "Aragorn";
		st4.nameLast1 = "Whats-his-name";
		st4.indexNumber1 = 20;
		st4.passedExams1 = new String[] {"Billowing coats"};
		st4.examPoints1 = new int[] {9};
		st4.grades1 = new int[] {5};

		//***************************************************************
		
		StudentData2 studentsArray2[] = new StudentData2[4];
		for (int i = 0; i < 4; i++) {
			studentsArray2[i] = new StudentData2();
		}
		
		studentsArray2[0] = st1;
		studentsArray2[1] = st2;
		studentsArray2[2] = st3;
		studentsArray2[3] = st4;
		
		for (int i = 0; i < 4; i++) {
			studentsArray2[i].printStudentData2();
			studentsArray2[i].printStudentExams2();
			studentsArray2[i].printExamsIfGrade2(8);
			//studentsArray[i].printExamsIfPoints();
			studentsArray2[i].gradeAverage2();
		}

	}

}
