package lesson02;

public class Ls02Ex02 {

	public static void main(String[] args) {
		//use the % !!!
		int year = 2040;
		
		if (year%400 == 0) {
			System.out.println("It's a leap year");
		} else if (year%100 == 0) {
			System.out.println("Not a leap year");
		} else if (year%4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not leap");
		}

	}

}
