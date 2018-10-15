package lesson06;
// exercise 1, 2, 3, and 4
public class Ls06Ex01 {

	public static void main(String[] args) {
		int[] b = {1, 3, 5, -9};
		System.out.println("The min number is " + findMin(b));
		System.out.println("The max number is " + findMax(b));
		System.out.println("The sum is " + findSum(b));
		System.out.println("The average is " + findAvg(b));

	}

// exercise 2
	static int findMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
// exercise 1
	
	static int findMax(int[] n) {
		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		return max;
	}

// exercise 3
	static int findSum(int[] n) {
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		return sum;
	}

	// exercise 4
	static double findAvg(int[] n) {
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		double avg = sum / n.length;
		return avg;
	}

	
}
