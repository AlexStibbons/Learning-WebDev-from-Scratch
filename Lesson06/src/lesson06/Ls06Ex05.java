package lesson06;
//exercise 8
public class Ls06Ex05 {
	
	 static String reverse(int[][] n) {
		
		int[][] b = new int[n[0].length][n.length];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[0].length; j++) {
				b[j][i] = n[i][j];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	String c = "It is printed within static. But how to return only one value, because the whole array should be printed out?";
	return c;
				
	}

 

	public static void main(String[] args) {


		int[][] a = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		
	
		System.out.println(reverse(a));
		
	/*	int[][] b = new int[a[0].length][a.length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[j][i] = a[i][j];
			}

		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		} */


	}

}
