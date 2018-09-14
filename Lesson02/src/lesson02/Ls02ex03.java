package lesson02;

public class Ls02ex03 {

	public static void main(String[] args) {
	
	double x = 35;
	double y = 15;

	if (x > y) {
		double min = y;
		double max = x;
	} else {
		double min = x;
		double max = y;
	}

	Sting operacija = "switch";

	switch (operacija) {
		Case "min":
		System.out.println(min);
		break;
		Case "max":
		System.out.println(max);
		break;
		Case "swap":
		//something
		break;
		Case "equals":
		//something
		break;
		default:
		System.out.println("Incorrect input");
	}

	}

}
