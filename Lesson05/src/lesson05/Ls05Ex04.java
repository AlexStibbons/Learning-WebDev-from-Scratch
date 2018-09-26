package lesson05;
// exercise 6
public class Ls05Ex04 {

	public static void main(String[] args) {

		//int m = 3;
		double[] d = {3.2, 2.5, 6.7, 10.0, 8.5};
		
		
		// find the current sum and average
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		
		System.out.println("The current sum is: " + sum);
		
		double avrg = sum / d.length;
		
		System.out.println("The current average is: " + avrg);
		
		//wanted x
		double x;
		
		x = avrg * d.length+1 / sum;
		
		System.out.println(x);
				
		
		
		
	}

}
