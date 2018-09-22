package lesson04;
//exercises from 1 to 4
public class Ls04Ex01 {
	
	public static void main(String[] args) {
		
		int numbers[] = {-1, -10, -40, -30};
		int numbersSum = 0;
		
		int max = numbers[0]; // just pick the first one ffs
		
		int min = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			
			numbersSum += numbers[i];
			
			if (numbers[i] > max) {
				max = numbers[i];
			};
			
			if (numbers[i] < min)
				min = numbers[i];
		}
		
		System.out.println(max);

		
		double numbersAvrg = (double) numbersSum / numbers.length;

		System.out.println("The total sum is: " + numbersSum + 
			"\n The average is: " + numbersAvrg + "\n The max number is: " + max + 
			"\n The min number is: " + min);

	}

}
