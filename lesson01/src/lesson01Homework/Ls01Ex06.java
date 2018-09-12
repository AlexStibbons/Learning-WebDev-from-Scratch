package lesson01Homework;

public class Ls01Ex06 {
	public static void main(String[] args) {
		String firstName = "Firt name";
		String lastName = "Last name";
		String index = "9/18";
		System.out.println(firstName + " " + lastName + ", index number " + index + " passed the following exams:\n");
		String ispit1 = "Biology: "; // it would be easier with an if then conditional, and then a counter
		boolean ispit1b = true;
		int ispit1o = 9;
		System.out.println("\t" + ispit1 + ispit1b + " ocena: " + ispit1o);
		String ispit2 = "Mathematics: ";
		boolean ispit2b = true;
		int ispit2o = 6;
		System.out.println("\t" + ispit2 + ispit2b + " ocena: " + ispit2o);
		String ispit3 = "Anthropology: ";
		boolean ispit3b = true;
		int ispit3o = 8;
		System.out.println("\t" + ispit3 + ispit3b + " ocena: " + ispit3o);
		String ispit4 = "Philosophy: ";
		boolean ispit4b = true;
		int ispit4o = 10;
		System.out.println("\t" + ispit4 + ispit4b + " ocena: " + ispit4o);
		String ispit5 = "Sociology:";
		boolean ispit5b = true;
		int ispit5o = 9;
		System.out.println("\t" + ispit5 + ispit5b + " ocena: " + ispit5o);
		double prosek = (ispit1o + ispit2o + ispit3o + ispit4o + ispit5o) / 5.0;
		System.out.println("Prosecna ocena je: " + prosek);
		int espb = 5 * 6;
		System.out.println("Ukupni osvojeni bodovi: " + espb);



	}
}
