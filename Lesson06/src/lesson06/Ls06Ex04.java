package lesson06;
// exercise 7
public class Ls06Ex04 {
	
	/*static int findDiaSum(int[][] n) {
		int sum = 0;
		int d = n.length;
		for (int i = 0; i < n.length; i++) {
			sum += n[d - i - 1][i];
		}
		return sum;
	}*/
	
	static int findDiaSum(int[][] n ) {
		int sum = 0;
	
		for (int i = 0; i < n.length; i++){
			sum += n[i][i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[][] a = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		System.out.println("The sum of small diagonal is " + findDiaSum(a));
	}

}
