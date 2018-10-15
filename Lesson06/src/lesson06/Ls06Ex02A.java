package lesson06;

public class Ls06Ex02A {
	
	static double median(int[] n) {
		
		for (int i = 0; i < n.length - 1; i++) { //how many times will you look for a minimum?
			int minIndex = i; // take this number's index as the minimums index
			for (int j = i + 1; j < n.length; j++) { // now go through every number in the array, but disregard the inspected ones [which are the is]
				if (n[j] < n[minIndex]) { // if that element is smaller that the one we declared to be the minimum
					minIndex = j; // this the the new idex of the minumum
				}
			}
			int temp = n[i]; //now keep i
			n[i] = n[minIndex]; // replace it with the value within n[minIndex]
			n[minIndex] = temp; // but keep minIndex
		}
		
		int med = n[n.length/2];
		return med;
		
	}

	public static void main(String[] args) {
		/*
		 *find a minimum, replace it with n[0] - repeat, 
		 *but with the rest of the array (that one starts with i =1)
		 *one loop that count how many times this is done
		 *the inside loop that finds min is called as many times as n.length-1		  
		 */
		int[] n = {5, 7, 1, 35, 67, 5, 10, 2};
		// 1 2 5 7 10 35 67
		System.out.println("The median number in the array is: " + median(n));

	}

}
