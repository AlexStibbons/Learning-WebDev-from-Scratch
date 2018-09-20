package lesson03;

public class Ls03Ex06 {
	public static void main(String[] args) {

		String[] inxN = {"1/01", "2/02", "3/03", "4/04"};
		String[] stNames = {"One", "Two", "Three", "Four"};
		String[] lsNames = {"First", "Second", "Third", "Fourth"};
				

		// string of all students and their passed exams
		String[] student1 = {"1", "2"}; //0
		String[] student2 = {"3", "1"}; // 1
		String[] student3 = {"2", "3"}; // 2
				//string of all lectures

				/* if (student1[0] == student2[1])
					System.out.println("working"); */

		String[][] examsMas = {
			{"1", "Culturology", "6 points"}, //0
			{"2", "Philosophy", "8 points"}, // 1
			{"3", "Political Theory", "6 points"} //2
		}; 

			

		for (int sc = 0; sc <= 2; sc++) { //looking for student1, student2, or student3
			
			String scS = "index number: " + inxN[sc] + " Name: " + stNames[sc] 
			+ " " + lsNames[sc] + " Passed: ";
			
			switch (sc) { //if the counter is 0, we go to student1 data
				
				case 0:
					for (int stC = 0; stC <= 1; stC++) { /* counter for exam 
						identifiers, so it knows which exam to print out */ 
						for (int exRows = 0; exRows <= 2; exRows++) { /* examining 
							all exam rows, rows only */
							if (student1[stC] == examsMas[exRows][0]) /*if it's row 0,
							memorize data for examsMas[0][1] and examsMas[0][2]
							1 and 2 stay unchanged because the only changable 
							is the row the exam data is in*/
							scS += " " + examsMas[exRows][1] + " " + examsMas[exRows][2];
						}
					}	
					System.out.println(scS);
					break;

				case 1:
					for (int stC = 0; stC <= 1; stC++) {
						for (int exRows = 0; exRows <= 2; exRows++) { 
						if (student2[stC] == examsMas[exRows][0])
							scS += " " + examsMas[exRows][1] + " " + examsMas[exRows][2];
						}
					}	
					System.out.println(scS);
					break;

				case 2:
					for (int stC = 0; stC <= 1; stC++) { 
						for (int exRows = 0; exRows <= 2; exRows++) {
						if (student3[stC] == examsMas[exRows][0])
							scS += " " + examsMas[exRows][1] + " " + examsMas[exRows][2];
						}
					}	
					System.out.println(scS);
					break;
			}

		}



	}


}
