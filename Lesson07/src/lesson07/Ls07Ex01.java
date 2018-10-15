package lesson07;

public class Ls07Ex01 {

	public static void main(String[] args) {

		StudentData a = new StudentData();
		a.nameFirst = "Justine";
		a.nameLast = "Frankenstein";
		a.indexNumber = 3215;
		a.passedExams = new String[] {"Philosophy", "Literature"};
		a.examPoints = new String[] {"(6 points)", "(10 points)"};
		a.grades = new int[] {10, 10};
		//a.printStudentData();
		
		StudentData b = new StudentData();
		b.nameFirst = "Beatrice"; 
		b.nameLast = "Rapaccini";
		b.indexNumber = 3218;
		b.passedExams = new String[] {"Botany", "Chemistry", "Falconry"};
		b.examPoints = new String[] {"(8 points)", "(12 points)", "(2 points)"};
		b.grades = new int[] {9, 10, 6};
		//b.printStudentData();

		StudentData c = new StudentData();
		c.nameFirst = "Diana";
		c.nameLast = "Hyde";
		c.indexNumber = 3211;
		c.passedExams = new String[] {"Physics", "Harpiscord Studies"};
		c.examPoints = new String[] {"(3 points)", "(2 points)"};
		c.grades = new int[] {5, 6};
		//c.printStudentData();

		StudentData d = new StudentData();
		d.nameFirst = "Lucinda";
		d.nameLast = "Van Helsing";
		d.indexNumber = 3220;
		d.passedExams = new String[] {"Alchemy"};
		d.examPoints = new String[] {"(13 points)"};
		d.grades = new int[] {9};
		//d.printStudentData();

		StudentData studentsArray[] = new StudentData[4];
		for (int i = 0; i < 4; i++) {
			studentsArray[i] = new StudentData();
		}

		studentsArray[0] = a; // already declared; no need for "= StudentData a" again, just the name of it
		studentsArray[1] = b;
		studentsArray[2] = c;
		studentsArray[3] = d;
		
		for (int i = 0; i < 4; i++) {
			studentsArray[i].printStudentData();
			studentsArray[i].printStudentExams();
			studentsArray[i].printExamsIfGrade(8); //--> the 8 is int p which is in "args" of the method
			studentsArray[i].printExamsIfPoints(8, 9);
			studentsArray[i].gradeAverage();
		}
		


	}

}
