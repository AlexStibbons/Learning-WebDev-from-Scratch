package lesson03;

public class Ls03Ex03A {

	public static void main(String[] args) {

		int[] n = {1, 2, 458, 485, 25, 8, 485};
		int x = 458;
		int c = 0;
	
		for (int i = 0; i <= 6; i++) {
			if (n[i] == x)
			c++; //why is it not counting?
		}
	
		if (c != 0) {
				System.out.println("Number " + x +
						" is in the array. \n" + x + " shows up " + c + " times."); 
		} else {
		System.out.println("[c counter version] The number " + x + 
			" is not in the array");
		}

	}

}
