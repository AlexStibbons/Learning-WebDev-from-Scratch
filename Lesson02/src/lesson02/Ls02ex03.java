package lesson02;

public class Ls02Ex03 {

	public static void main(String[] args) {
		double x = 35;
		double y = 15;


		String operacija = "max";

		switch (operacija) {
			case "min":
					double min; // declare a min above the if block so it's recognizable
					// this way the program rembers the min, and all it's
					// left is to print it after everything, careful there might be duplicates
					if (x > y) {
							min = y;
					} else {
							min = x;
					}
					System.out.println("Min is " + min);
				break;
			case "max":
					if (x > y) {
							double max = x;
							System.out.println("Max is " + max);
					} else {
							double max = y;
							System.out.println("Max is " + max);
					}
				break;
			case "swap":
					double a = x; // one extra holder is enough, you don't need two
					double b = y;
					x = b;
					y = a;
					System.out.println("X used to be 35 but is now " + x + 
						"\n Y used to be 15 but is now " + y);	
				break;
			case "equals":
						if (x == y) {
							System.out.println("0");
						} else if (x > y) {
							System.out.println("1");
						} else if (x < y) {
							System.out.println("-1");
						}
				break;
			default:
				System.out.println("Incorrect input");
		}

	}

}
