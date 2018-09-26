package lesson05;
// exercise 7
public class Ls05Ex05 {

	public static void main(String[] args) {
		
		int[] n = {1, 3, 2, 4, 5, 3, 2, 1};
		int sum = 0;
		int max = n[0] + n[1] + n[2];
		int a = -1;
		
		for (int i = 1; i <= n.length - 3; i++) {
			
			System.out.println("Look at: " + n[i] + ", " + n[i+1] + ", and " + n[i+2]);

			sum = n[i] + n[i+1] + n[i+2];
			
			System.out.println("Their sum is: " + sum);
			
			if (sum > max) { // it memorizes max, and goes back up, with the new max memorizes
				max = sum; // now memorize i!!
				a = i;
			}

		}
		System.out.println();
		System.out.println("The max sum is: " + max + 
				"\n The numbers that make it are: " + n[a] + ", " + 
				n[a+1] + ", and " + n[a+2] + ".");

	}

}
