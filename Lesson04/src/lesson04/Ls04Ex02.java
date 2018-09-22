package lesson04;
//exercise 5
public class Ls04Ex02 {

	public static void main(String[] args) {
		
		int[] n = {2, 7, 9, 9, 7, 2};
		
		// DRAW THINGS OUT
		// compares i [the first one] to the last one 
		// which is n.lenghts-1-i
		
		int d = n.length;
		
		for (int i = 0; i < d; i++) {
			if (n[i] != n[d-1-i]) {
				System.out.println("not paralel");
				break;
			} 
	
		}
		
		System.out.println("paralel");
		
	}

}
