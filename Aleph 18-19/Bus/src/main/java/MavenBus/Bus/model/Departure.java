package MavenBus.Bus.model;

import java.util.ArrayList;
import java.util.List;

public class Departure {
	
	private int id;
	private String time;
	private List<Bus> buses = new ArrayList<Bus>();
	
	public Departure() {
		
	}
	
	public Departure(int id, String time) {
		super();
		this.id = id;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<Bus> getBuses() {
		return buses;
	}

	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}

	@Override
	public String toString() {
		return "Departure [id=" + id + ", time=" + time + "]";
	}
	
	
	

}
