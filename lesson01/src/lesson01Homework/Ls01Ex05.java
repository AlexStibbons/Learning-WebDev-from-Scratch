package lesson01Homework;

public class Ls01Ex05 {
	public static void main(String[] args) {

		int pricePerItem = 10; // or all with double
		String ppi = "One item costs " + pricePerItem;
		System.out.println(ppi);
		int numberOfItems = 3;
		System.out.println("The number of items is " + numberOfItems);
		double discountPercent = 25;
		System.out.println("The discount you get is " + discountPercent + "%");
		int summItems = pricePerItem * numberOfItems;
		System.out.println("The total price of " + numberOfItems + " items is " + summItems);
		double discountDecimal = discountPercent / 100.0;
		System.out.println(discountDecimal);
		
		System.out.println("The final price is ");

		

		}
}
