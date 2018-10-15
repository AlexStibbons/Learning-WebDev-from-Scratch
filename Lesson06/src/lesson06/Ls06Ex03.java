package lesson06;
// exercise 5
public class Ls06Ex03 {
	
	static int findValue(int[] n, int v) {
	
		for (int i = 0; i < n.length; i++) {
			if (n[i] == v) {
				return i;
			} 
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] a = {1, 7, 8, 9, 76};
		int b = 9;
		System.out.println(findValue(a, b));
	

	}

}
