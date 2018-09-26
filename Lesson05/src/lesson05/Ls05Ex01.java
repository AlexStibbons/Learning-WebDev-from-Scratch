package lesson05;
//exercise 1, 2
public class Ls05Ex01 {

	public static void main(String[] args) {

		int[] a = {30, 5, 1, 6, 7};
		int[] b = {7, 6, 10, 3, 8};
		//boolean inBoth;

		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < b.length; j++) {
				// System.out.print("Examining " + a[i] + " " + b[j] + "\n");
				if (a[i] == b[j]) {
					System.out.println("Number " + a[i] + " is in both");
					//inBoth = true;
					break;
				} 
			}
		}

		// exercise 2
	
		for (int iA = 0; iA < a.length; iA++){
			System.out.print(a[iA] + " ");
		}
		
		
			for (int jB = 0; jB < b.length; jB++) {
				boolean same = false;
				for (int jA = 0; jA < a.length; jA++) {
					if (b[jB] == a[jA]) {
						same = true;
						break;
					}
				}
				if (!same)
					System.out.print(b[jB] + " ");
			}
		
		// exercise 3
			
		for (int i = 0; i < a.length; i++) {
			boolean same1 = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					same1 = true;
					break;
				}
			} 
			if (!same1)
				System.out.println("\n " + a[i]);
		}

			
	}

}
