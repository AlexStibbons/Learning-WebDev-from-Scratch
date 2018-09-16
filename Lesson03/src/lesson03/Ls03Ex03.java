package lesson03;

public class Ls03Ex03 {

	public static void main(String[] args) {

		int[] n = {1, 2, 458, 485, 25, 8, 485};
		int x = 458;
		int y = 0;
				
		for (int i = 0; i <= 6; i++) {
				
				if (n[i] != x) {
					System.out.println("Number " + x + 
							" is not in the array.");	
					
				} else {
					y++;
					System.out.println("Number " + x + 
							" is in the array.");
				}
				
		System.out.println("The number of times the int " + x +
					"is in the array is " + y);
		
		/* DIFFERENTLY
		 the chosen number shows up 3 times */
		
		System.out.println("\n\n\n");

			int c = 0;
		
		for (int d = 0; d <= 6; d++) {

			if (n[d] == x)
				c++;
			// does it revert back to 0? why?
		}
		
		

		if (c != 0) {
			System.out.println("Number " + x +
				" is in the array. \n" +
				x + " shows up " + c + " times."); 
		} else {
			System.out.println("The number " + x + 
				" is not in the array");
		}
		
				
		}

	}

}
