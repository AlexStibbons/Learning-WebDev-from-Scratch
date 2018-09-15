package lesson02;

public class Ls02Ex04 {

	enum exams {anthropology, math, philosophy, biology, 
		horticulture} /* you can take a horticulture, but you 
		can't make her like it - Dorothy Parker*/

	public static void main(String[] args) {
		 
		 exams a = exams.anthropology;
		 exams b = exams.math;
		 exams c = exams.philosophy;
		 exams d = exams.biology;
		 exams e = exams.horticulture;

		 String studentName = "Name";
		 String studentLName = "Last name";
		 String index = "209/12";

		 double gradeA = 8;
		 double gradeB = 6;
		 double gradeC = 9;
		 double gradeD = 7;
		 double gradeE = 10;

		 double pointsA = 4;
		 double pointsB = 6;
		 double pointsC = 12;
		 double pointsD = 8;
		 double pointsE = 2;

		 double pointsSum = pointsA + pointsB + pointsC + 
		 pointsD + pointsE;

		

		 System.out.println("Student " + studentName + " " + studentLName +
		 	", index number" +
		 	 index + ", passed the follwing exams: \n\t " + 
		 	exams.anthropology + "\n\t" + exams.math + "\n\t" +
		 	exams.philosophy + "\n\t" + exams.biology + "\n\t" + exams.horticulture);
		 

		 if (gradeA >= 8) 
		 	System.out.println(a + " - a grade equal or higher than 8");
		 if (gradeB >= 8)
		 	System.out.println(b + " - a grade equal or higher than 8");
		  if (gradeC >= 8)
		 	System.out.println(c + " - a grade equal or higher than 8");
		  if (gradeD >= 8)
		 	System.out.println(d + " - a grade equal or higher than 8");
		  if (gradeE >= 8)
		 	System.out.println(e + " - a grade equal or higher than 8");
		 

		 if (gradeA >= 8 && pointsA >= 5)
		 	System.out.println(a + " is the exam where the grade is higher or equal to 8, and the points are higher or equal to 5");
		 if (gradeB >= 8 && pointsB >= 5)
		 	System.out.println(b + " is the exam where the grade is higher or equal to 8, and the points are higher or equal to 5");
		 if (gradeC >= 8 && pointsC >= 5)
		 	System.out.println(c + " is the exam where the grade is higher or equal to 8, and the points are higher or equal to 5");
		 if (gradeD >= 8 && pointsD >= 5)
		 	System.out.println(d + " is the exam where the grade is higher or equal to 8, and the points are higher or equal to 5");
		 if (gradeE >= 8 && pointsE >= 5)
		 	System.out.println(e + " is the exam where the grade is higher or equal to 8, and the points are higher or equal to 5");

		 //find the max grade --> this can also be done with the holder, like
		 // in switching 2 numbers
		 if (gradeA > gradeB && gradeA > gradeC && gradeA > gradeD && gradeA > gradeE)
		 	System.out.println("The max grade is " + gradeA + " subject: " + a);
		  if (gradeB > gradeA && gradeB > gradeC && gradeB > gradeD && gradeB > gradeE)
		 	System.out.println("The max grade is " + gradeB + " subject: " + b);
		  if (gradeC > gradeA && gradeC > gradeB && gradeC > gradeD && gradeC > gradeE)
		 	System.out.println("The max grade is " + gradeC + " subject: " + c);
		  if (gradeD > gradeB && gradeD > gradeC && gradeD > gradeA && gradeD > gradeE)
		 	System.out.println("The max grade is " + gradeD + " subject: " + d);
		  if (gradeE > gradeB && gradeE > gradeC && gradeE > gradeD && gradeE > gradeA)
		 	System.out.println("The max grade is " + gradeE + " subject: " + e);

		 // find lowest points - remember the holder way to do it!!
		 double minpoints = pointsA;
		 // put the minexam variable and print them
		 // at the end - bc they are before if, they will be remembered
		 // got back to prev example and redo this
		 // this way the output can be pushed all the way to the ends
		 // and there will be a minpoints and the minexam variable
		 if (minpoints > pointsA) {
		 	minpoints = pointsA;
		 	System.out.println("minimum points is " + 
		 		pointsA + ", exam " + a);
		 } else if (minpoints > pointsB) {
		 	minpoints = pointsB;
		 	System.out.println("minimum points is " + 
		 		pointsB + ", exam " + b);
		 } else if (minpoints > pointsC) {
		 	minpoints = pointsC;
		 	System.out.println("minimum points is " + 
		 		pointsC + ", exam " + c);
		 } else if (minpoints > pointsD) {
		 	minpoints = pointsD;
		 	System.out.println("minimum points is " + 
		 		pointsD + ", exam " + d);
		 } else if (minpoints > pointsE) {
		 	minpoints = pointsE;
		 	System.out.println("minimum points is " + 
		 		pointsE + ", exam " + e);
		 }

		 int userinput = 5;

		 switch (userinput) { //fixproperly
		 	case 1:
		 	System.out.println("Exam n1: " + a + " " + gradeA + " " + pointsA);
		 	case 2:
		 	System.out.println("Exam n2: " + b + gradeB + pointsB);
		 	case 3:
		 	System.out.println("Exam n3: " + c + gradeC + pointsC);
		 	case 4:
		 	System.out.println("Exam n4: " + d + gradeD + pointsD);
		 	case 5:
		 	System.out.println("Exam n5: " + e + " " + gradeE + " " + pointsE);
		 }

		 String studiesType = "master";
		 
		 switch (studiesType) {
		 	case "bachelors":
		 	System.out.println("Bachelor's sudies");
		 	break;
		 	case "master":
		 	System.out.println("Master's studies");
		 	break;
		 	case "doctoral":
		 	System.out.println("Doctoral studies");
		 	break;
		 }
	}

}
