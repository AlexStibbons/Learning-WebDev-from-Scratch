package lesson08;

public class ObjectData {
	
	private String objectName;
	private String objectAttribute;
	private String objectNumber;
	
	static int counter = 0;
	
	public ObjectData() {
		counter++;
	}
	
	public ObjectData(String objectNumber, String objectName, String objectAttribute) {
		counter++;
		this.objectNumber = objectNumber;
		this.objectName = objectName;
		this.objectAttribute = objectAttribute;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectAttribute() {
		return objectAttribute;
	}

	public void setObjectAttribute(String objectAttribute) {
		this.objectAttribute = objectAttribute;
	}

	public String getObjectNumber() {
		return objectNumber;
	}

	public void setObjectNumber(String objectNumber) {
		this.objectNumber = objectNumber;
	}
	
	
	///////////////////////////////////////////////////////////////////////////
	public void printObjectData() {
		System.out.println(this.objectNumber + " " + this.objectName + " " + this.objectAttribute);
	}
	
	public void findObjectByNumber(String c2) {

		if (c2.equals(objectNumber)) {
			System.out.println("Ah, the number " + c2 + " Here it is. " + this.objectName + " " + this.objectAttribute +
					"\nTruly, one of the greatest in this little Emporium."); //printObjectData();
		}
	} //if i want a String return, I'd have to memorize the printed string above, then put return 
	
	public static int howManyObjectsToDelete(/*String c5*/) {
		//int del = -1;
		String numDelInput = null;
		
		System.out.print("How many object would you like to take?	");
		
		numDelInput = UserInput.userInput();
		int numDel = Integer.parseInt(numDelInput);
		
		counter -= numDel;
		System.out.println("After we are done, there will be " + counter + " objects left.");
		
		return numDel;
	} 


}
