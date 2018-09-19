package lesson03;

public class Ls03Ex01 {

	public static void main(String[] args) {
		
		System.out.println("The amount needed from the ATM is 2850");

		int n = 2850;
		int[] opt = {1000, 500, 100, 50};

	
		if (n%50 == 0) {
			while (n > 0) {
				for (int i = 0; i < 4; i++) {
					int th = n / opt[i];
						if (th > 0) {
							System.out.println("You get " + th + " " 
							+ opt[i] + " bills.");
							n = n - th * opt[i];
							System.out.println("What's left to pay out is " + n);
						} 
					}
				}
	
		} else {
			System.out.println("not divisable by 50, try again");
				}
	}
	

	}