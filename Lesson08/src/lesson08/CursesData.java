package lesson08;

public class CursesData {
	
	private String curseIndex;
	private String curseName;
	private String curseInfo;
	
	public CursesData() {
	}
	
	public CursesData(String curseIndex, String curseName, String curseInfo) {
		this.curseIndex = curseIndex;
		this.curseName = curseName;
		this.curseInfo = curseInfo;
	}

	public String getCurseIndex() {
		return curseIndex;
	}

	public void setCurseIndex(String curseIndex) {
		this.curseIndex = curseIndex;
	}

	public String getCurseName() {
		return curseName;
	}

	public void setCurseName(String curseName) {
		this.curseName = curseName;
	}

	public String getCurseInfo() {
		return curseInfo;
	}

	public void setCurseInfo(String curseInfo) {
		this.curseInfo = curseInfo;
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	
	public void printCursesData() {
		System.out.println("This curse's index number is" + this.curseIndex + 
					", its name is " + this.curseName + ", and its info is: " + this.curseInfo
					/*this.curseIndex, this.curseName, this.curseInfo*/); //how to do it with %s again?
	}
}
