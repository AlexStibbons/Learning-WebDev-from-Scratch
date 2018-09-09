package folder.subfoler;

class ls1ex5 {
	
	public static void main(String[] args) {

	int pricePerItem = 10; // or all with double
	String ppi = "One item costs " + pricePerItem;
	System.out.println(ppi); //does this work?
	int numberOfItems = 3;
	int discountPercent = 50;
	double discount = discountPercent / 100;
	double finalp = pricePerItem * numberOfItems * discount;
	System.out.prinln("The final price is " + finalp);

	// NOT really correct, needs fixing later

	}
}