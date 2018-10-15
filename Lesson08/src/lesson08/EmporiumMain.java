package lesson08;

public class EmporiumMain {

	public static void main(String[] args) {
		
		ObjectData[] objectArray = new ObjectData[100];
		objectArray[0] = new ObjectData("1243", "Eye", "of Newt");
		objectArray[1] = new ObjectData("13", "Hazel", "Witch's");
		objectArray[2] = new ObjectData("42", "Life Universe", "and Everything");
		objectArray[3] = new ObjectData("678", "Toe", "of Conan"); 
		
		String choice = null;
		//String confirmation = null; //--> add a Y/N option to continue, if N, print goodbye and exit, if Y continue
		
		do {
		
			System.out.print("*********Inventory*********\n" + 
								"~1 List All Objects of Interest\n" + 
								"~2 Find Object by its number\n" + 
								"~3 Add an Object to the Emporium\n" +
								"~4 Change an Object\n" +
								"~5 Delete an object\n" +
								"~6 Escape \n"); // add how each object has several curses attached to it
			System.out.print("\nWhich one would you like?   ");
			
			choice = UserInput.userInput();
			System.out.println("You chose: " + choice + ".");
		
			
			if (choice.equals("6")) {
				System.out.println("Scared, are you? Perhaps another time. Goodbye.");
			} else {
				System.out.println("Before we continue, a warning.\n Each object in this little Emprorium \n" +
								"~~etc about curses~~");
				System.out.println("....................\n....................\n....................\n");
			}
			
						
			//System.out.println("\n"+ObjectData.counter);
			switch (choice) {
			
			case "1":
				for (int i = 0; i < ObjectData.counter; i++) {
					objectArray[i].printObjectData();
				}
				break;
			
			case "2":
				System.out.print("For that, I shall need the number of the object you are looking for.\n" 
								+ "Do tell.			");
				String addObject = null;
				addObject = UserInput.userInput();
				for (int i = 0; i < ObjectData.counter; i++) {
					objectArray[i].findObjectByNumber(addObject); //--> 42 will a new String, made by UserInput.userInput
				}
				break;
			
			case "3":
				String n = null;
				System.out.println("A gift to the Emporium! Marvellous!" + 
								"\nHow many treats have you brought us?		");
				n = UserInput.userInput();
				int numberOfNewObjects = Integer.parseInt(n);
				System.out.println(numberOfNewObjects + " new additions! You are too kind.");
				
				for (int i = 0; i < numberOfNewObjects; i++) {
					String nod = null; // maybe if i move this string out, and then ...what?
					System.out.print("Tell me, what are the object's number, name, and attributes" +
									"\nNo commas, please, only spaces		");
					nod = UserInput.userInput();
					String[] newObjectData = nod.split(" ");
					objectArray[ObjectData.counter] = new ObjectData(newObjectData[0], newObjectData[1], newObjectData[2]);
				}
				System.out.println("Let's check if they're properly in the Emporium.");
				for (int i = 0; i < ObjectData.counter; i++) {
					objectArray[i].printObjectData();
				}
	// shouldn't this new object be in a temporary object and then added to objectArray[ObjectData.counter]?
	// when i wrote it like that it had errors
	// how come it doesn't remember the imported data once it restarts?
				break;
			
			case "4":
				System.out.println("*****");
				// to change student data
				// find student in array [main]
				// ask for which change - case number/name/attribute
				// input new data [method]
				// change accordingly inside array [main]
				break;
			
			case "5":
				//System.out.println("lets delete withch hazel, index 1");
				int howManyToDelete = -1;
				howManyToDelete = ObjectData.howManyObjectsToDelete();
				// for i = 0 to howManyToDelete
				//put this in method findObjectToDelete
				System.out.print("For that, I shall need the number of the object you wish to delete.\n" 
						+ "Do tell.			");
				String wantedObject = null;
				wantedObject = UserInput.userInput();
				int objectToDeleteIndex = -1;
				for (int i = 0; i < ObjectData.counter; i++) {
					objectArray[i].findObjectByNumber(wantedObject);
					objectToDeleteIndex = i;
				}
				//***how many would you like to delete? --> counter-n
				// find object, memorize index number
				//***move one place back
				ObjectData.counter -= 1; //--> delete line bc it's already done in .howManyObjectsToDelete
				for (int i = 1; i < ObjectData.counter; i++) { // i is the index number 
					objectArray[i] = objectArray[i+1];
				} //--> anything that has to do with array, must stay in main
				System.out.println("Did it work?");
				for (int i = 0; i < ObjectData.counter; i++) {
					objectArray[i].printObjectData();
				}
				break;
			}
		} while (!choice.equals("6"));

	}

}
