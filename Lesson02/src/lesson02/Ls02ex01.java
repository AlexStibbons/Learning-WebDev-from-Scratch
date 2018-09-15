package lesson02;

public class Ls02Ex01 {

	public static void main(String[] args) {
		int numberItems = 5;
		double pricePerItem = 20;
		boolean discount = true;
		double totalPrice = numberItems * pricePerItem;
		System.out.println("Total price is " + totalPrice);

		if (discount == true) { /* or simply (!discount) --> if discount
		 is false */
			System.out.println("\t You have a 10% discount.");
			double discountSub = totalPrice / 10.0;
			double finalPrice = totalPrice - discountSub;
			System.out.println("Your price is " + finalPrice);
		} else if (discount == false) {
			System.out.println("You have no discount. \n Your price is " + totalPrice);
		} else {
			System.out.println("Error");
		}

	}

}
