package lesson06;
// exercise 9 - fibonacci
public class Ls06Ex06 {

	public static void main(String[] args) {
		
		int[] n = new int[10];
		n[0] = 1;
		n[1] = 1;
		int a = 13;
		
		for (int i = 2; i < n.length; i++) {
			n[i] = n[i-1] + n[i-2];
			//System.out.print(n[i] + " ");
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < n.length; i++) {
			if (n[i] == a) {
				System.out.println(n[i] + " on index " // can use counter here, so that when 
						//it exists for loop, it prints null if counter is 0
			+ i + ", the number " + a);
				break;
			}
		}

	}
}
