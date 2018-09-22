package lesson04;

public class Ls04Ex03 {
	// exercises 6, 7. 8
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };

		int sum = 0;
		int c = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c++;
				sum += a[i][j];
			}
		}

		int avr = sum / c;

		System.out.println("The total sum is: " + sum + "\n The number of elemts is: " + c
				+ "\n The average of the sum is: " + avr);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] < avr)
					System.out.println(a[i][j]);
			}
		}

	}
}
