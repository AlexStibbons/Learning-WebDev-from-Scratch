package lesson05;
//exercise 4
public class Ls05Ex02 {

	public static void main(String[] args) {
		
		int[] a = {1, 0, 1, 1, 0, 1};
		int[] b = {0, 1, 1, 0, 0, 1};
		
		int[] c = {0, 0, 0, 0, 0, 0}; // dont need it, you can just system print
		
		for (int i = 0; i < a.length; i++) {
			//boolean diff = false;
			if (a[i] != b[i]) {
				c[i] = 1;
				//break;
			}
		}
		
		for (int cI = 0; cI < c.length; cI++) {
			System.out.print(c[cI] + " ");
		}
	}

}
