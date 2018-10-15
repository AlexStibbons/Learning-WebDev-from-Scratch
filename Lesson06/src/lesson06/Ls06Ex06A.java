package lesson06;
// exercise 9 - fibonacci
public class Ls06Ex06A {

	public static void main(String[] args) {
		
		int m = 2;
		int[] n = new int[m];
		n[0] = 1;
		n[1] = 1;
		int a = 5;
/*		
		if (a <= 1) {
			System.out.println(1);
		} else {
			for (i = 2; i < a + 1; i++){
				m++;
				for (int i = 2; i < m; i++) {
					n[i] = n[i-1] + n[i-2];
					//System.out.print(n[i] + " ");
		}

			}
		}
		Idea here is that it should go back, add a new index/slot,
		calculate what's inside that slot [n[i] = n[i-1] + n[i-2],
		then if that is still unequal to the numer were looking for [a]
		it goes back adds a new index/slot, and does that thing
		until a == n[i]
		obviously a loop, but what is that original counter, from where it all
		starts?
		cant be while, bc i have nothing to compare it to
		cant be a 'regular' i - for loop - bc i don't know the limit
*/		
		
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
