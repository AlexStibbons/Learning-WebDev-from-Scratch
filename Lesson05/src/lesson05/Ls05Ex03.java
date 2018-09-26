package lesson05;
// execise 5
public class Ls05Ex03 {

	public static void main(String[] args) {
		
		int[] n = {1, 2, 3, 1, 3, 5, 3, 1, 4, 3};
		
		for (int i = 0; i < n.length; i++) {
			boolean uniqueA = true;
			for (int j = 0; j < n.length; j++) {
				if (i == j) {
					continue; // skip this! it skips this particular j, and goes to the next one
				}
				if (n[i] == n[j]) {
					uniqueA = false;
					break;
				}
			}
			if (uniqueA == true) // remember ==, not just =
				System.out.println(n[i]);
		}


	}

}
