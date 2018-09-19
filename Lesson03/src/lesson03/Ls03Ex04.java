package lesson03;

public class Ls03Ex04 {

	public static void main(String[] args) {

		/* using n.length
		int[] n = {0, 1, 2, 3}; // length is 4,
		 it does not count indexes, just the length
		
		for (int i = 0; i < n.length; i++)
			System.out.println(n[i]); */
		
		String[] exams = {"Anthropology", "Math", "Philosophy", "Biology", "Horticulture"};
		double[] grades = {8.0, 6.0, 9.0, 7.0, 10.0};
		int[] points = {4, 6, 12, 8, 13}; 

		for (int i =0; i < 5; i++) { //2 for cycles lest the printing is every time the 2 conditions apply

			if (grades[i] >= 8)
				System.out.println("The exam with the grade equal or higher than 8 is: " 
					+ exams[i]);
		}

		System.out.println("\n");
		
		for (int i =0; i < 5; i++) {

			if (grades[i] >= 8 && points[i] >= 5)
				System.out.println("The exam with the grade equal or higher than 8 is: " 
					+ exams[i] + "\n the points for that exams are larger than 5: " 
					+ points[i]);
		}

		//student info arrays
		System.out.println("\n"); //breaker line
		
		String[] stNames = {"One", "Two", "Three", "Four"};
		String[] lsNames = {"First", "Second", "Third", "Fourth"};
		String[] inxN = {"1/01", "2/02", "3/03", "4/04"};

		//passed exams + points in multid arrays
		String[][] examsALL = {
			{"Philosophy (12 points) ", "Horticulture (13 points)"},
			{"Math (6 p) ", "Biology 7p"},
			{"Anthropology (8 p) ", "Physics 7p "},
			{"Comparative politics (12p) ", "Sociology (6p) "}
		}; 
		// REMEMBER THIS; best to draw out these things
		for (int c = 0; c <= 3; c++) {
			String cS = " index: " + inxN[c] + " name: " + stNames[c] +
					" last name:" + lsNames[c] + "Passed: ";
			for (int j = 0; j <= 1; j++) {
				cS += " " + examsALL[c][j] + 
					" ";
			}
			System.out.println(cS);
		}

		System.out.print("\n"); //breaker line
		// new array: info on lectures
		String[][] lectures = {
			{"1", "2", "3", "4"},
			{"Culturology", "Political Systems", "Public Sphere", "Logic"},
			{"8 points", "10 points", "6 points", "4 points"}
		};

		for (int k = 0; k <= 3; k++){
			for (int m = 0; m <= 2; m++){
			System.out.print(lectures[m][k] + " ");
			}
			System.out.print("\n"); /* this is tangled. the for in 
			61 DOES NOT need to be less than the for in 62*/
		}


		// string of all students and their passed exams
		String[] student1 = {"1", "2"}; // or should it be [][] and add index and names?
		String[] student2 = {"3", "1"};
		String[] student3 = {"2", "3"};
		//string of all lectures
		String examsMas = {
			{"1", "Culturology", "6 points"},
			{"2", "Philosophy", "8 points"},
			{"3", "Political Theory", "6 points"}

		} //etc

		/* "Promeniti model podataka tako da
			se studenta skladiste samo identifikatori polozenih 
			predmeta."

			Output should be:
			index firstname lastname passed exams
			Student1 passed exams under the id 1 and to, so for
			that student the output is:

			7/09 Dorothy Ozima Passed: Culturology 6 points and Philosophy 8 points
			indX[0] name[0] name[0]: passed: 
		*/ 



	}


}
