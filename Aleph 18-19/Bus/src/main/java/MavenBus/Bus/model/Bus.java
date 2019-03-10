package MavenBus.Bus.model;


public class Bus {

	private int id;
	private String line;
	private String destination;
	
	public Bus() {
		
	}
	
	public Bus(int id, String line, String destination) {
		super();
		this.id = id;
		this.line = line;
		this.destination = destination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Bus: \nid:" + id + "\nline:" + line + "\ndestination:" + destination;
	}
	
	
}
