package lesson06;
// exercise 6 test
public class Ls06Ex02 {

	/* static int[] findMedian(int[] n) {
		
	}*/ 
	
	public static void main(String[] args) {

		int[] n = {5, 1, 3, 10, 2}; //will need 2 counters after all, i and j
		int a = 0;
		int b = 0;

		for (int i = 1; i < n.length-1; i++) {
			if (n[i] < n[i-1]) {
				a = n[i-1];
				n[i-1] = n[i];
				n[i] = a;
			} else if (n[i] > n[i+1]) {
				b = n[i+1];
				n[i+1] = n[i];
				n[i] = b;
			}
		}
		for (int c=0; c<n.length; c++) {
			System.out.print(n[c] + " ");
		}
	}

}
