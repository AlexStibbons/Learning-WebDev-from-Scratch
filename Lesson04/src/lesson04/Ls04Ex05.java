package lesson04;
//exercise 11, 12, 13, 14, 15
public class Ls04Ex05 {

	public static void main(String[] args) {
		
		int[][] n = {
			{10, 2, 3},
			{4, 5, 6},
			{7, 8, 19}
		};
		
		int sum = 0;

	/*	for (int i = 0; i < n.length; i++){
			for (int j = n.length - 1; j < n.length; j++) {
				sum += n[i][j-1];
				System.out.println(sum);
			}
		}

		System.out.println("This is the sum of the middle column: " + sum); */
		
		int max = n[0][2]; // exercise 12, kinda
		
		for (int i = 0; i < n.length; i++){
			for (int j = n.length - 1; j < n.length; j++) { //change i only, bc that's the only one that changes.
				if (n[i][j-i] > max) {
					max = n[i][j-i];
				}
				sum += n[i][j-i];
				System.out.println(sum);
			}
		}
		
		System.out.println();
		System.out.println("This is the sum of the main diagonal (left to right): " 
			+ sum + "\n The max number in there is: " + max);

// exercise 13
		System.out.println();
		
		int sumA = 0;
		
		for (int iA = 0; iA < n.length; iA++){
				sumA += n[iA][iA];
				System.out.println(sumA);
		}
		
		System.out.println();
		System.out.println("This is the sum of the main diagonal (right to left): " 
			+ sumA);
		
// exercise 14 
		System.out.println();
		
		int sumB = 0;
		
		for (int iB = 0; iB < n.length; iB++){
				sumA += n[iB][iB];
				System.out.println(sumB);
		}
		
		System.out.println();
		System.out.println("This is the sum of the tiny diagonal to the left: " 
			+ sumB);
// exercise 15
		System.out.println();
		
		int sumC = 0;
		
		for (int iC = 0; iC < n.length; iC++){
				sumA += n[iC][iC];
				System.out.println(sumC);
		}
		
		System.out.println();
		System.out.println("This is the sum of the tiny diagonal to the left: " 
			+ sumC);

	}


}
