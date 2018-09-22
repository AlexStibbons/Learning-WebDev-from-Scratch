package lesson04;
//exercise 9, then 10
public class Ls04Ex04 {

	public static void main(String[] args) {
		
		int[][] n = {
			{0, 0, 0},
			{0, 0, 0},
			{0, 0, 0}
		};
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				n[i][j] = i+1;
				System.out.print(n[i][j] + " ");
			}
			System.out.println();

		}
		// exercise 10
		System.out.println("\n next");
		
		int[][] nA = {
				{0, 0, 0,},
				{0, 0, 0,},
				{0, 0, 0,}
			};
			
			for (int i = 0; i < nA.length; i++) {
				for (int j = 0; j < nA.length; j++) {
					nA[i][j] = i+j;
					System.out.print(nA[i][j] + " ");
				}
				System.out.println();
			}
		
	}


}
