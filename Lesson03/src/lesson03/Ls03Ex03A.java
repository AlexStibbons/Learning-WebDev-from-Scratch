package lesson03;

public class Ls03Ex03A {

	public static void main(String[] args) {
// variables:
		int[] n = {1, 2, 485, 485, 25, 8, 485};
		int x = 485;
// counters:		
		int c = 0;
		int i = 0;
// loops:		
		while (i <= 6) { /*used to be without while, 
		then it would stop after is found the number - why if the for loop clearly stated not to stop until i<7?*/
				for (i = 0; i <= 6; i++) { 
				if (n[i] == x)
					c++; 
				System.out.println("the number is: " + n[i] + " The c is:" + c + "\n");//why does it stop counting?
			}
	
			if (c != 0) {
					System.out.println("Number " + x +
							" is in the array. \n" + x + " shows up " + c + " times."); 
			} else {
				System.out.println("The number " + x + 
						" is not in the array");
			}
		}
	}

}
