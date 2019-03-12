package MavenBus.Bus.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import MavenBus.Bus.model.Bus;

@Component("busRepo")
public class BusRepo {
	
	private List<Bus> buses = new ArrayList<Bus>();
	
	public BusRepo() {
		
		buses.add(new Bus(1, "Locke", "Camorr"));
		buses.add(new Bus(2, "Bilbo", "The Shire"));
		buses.add(new Bus(3, "Vimes", "Ankh-Morpork"));
		buses.add(new Bus(4, "Beowulf", "Heorot Hall"));
		buses.add(new Bus(5, "Louise", "Arrival"));
	}
	
	public List<Bus> allBuses() {
		return buses;
	}
	
	public List<Bus> findByLine(String line){
		
		List<Bus> found = new ArrayList<Bus>();
		
		for (Bus bus : buses) {
			if (bus.getLine().toLowerCase().contains(line.toLowerCase())) {
				found.add(bus);
			}
		}

		return found;
	}
	
	public List<Bus> findByDestination(String destination) {
		List<Bus> found = new ArrayList<Bus>();
		
		for (Bus bus : buses) {
			if (bus.getDestination().toLowerCase().contains(destination.toLowerCase())) {
				found.add(bus);
			}
		}
		return found;
	}
	
	public Bus findById(int id) {
		
		for (Bus bus : buses) {
			if (bus.getId() == id) {
				return bus;
			}
		}
		return null;
	}
	
	public Bus saveBus(Bus bus) {
		
		Bus existingBus = findById(bus.getId());
		
		if (existingBus == null) {
			bus.setId(buses.get(buses.size()-1).getId()+1); // get id from last in line (buses.get(3).getId, for ex), then add 1 to that id
			buses.add(bus);
		} else {
			existingBus.setLine(bus.getLine());
			existingBus.setDestination(bus.getDestination());			
		}
		/*for (Bus existingBus : buses) {
			if (bus.getId() == existingBus.getId()) {
				existingBus.setLine(bus.getLine());
				existingBus.setDestination(bus.getDestination());
			} else {
				bus.setId(buses.get(buses.size()-1).getId()+1); // get id from last in line (buses.get(3).getId, for ex), then add 1 to that id
				buses.add(bus);
			}
		}*/
		return bus;
	}
	
	public void deleteBus(int id) {
		
//		for (Bus bus : buses) {
//			if (bus.getId() == id) {
//				buses.remove(bus);
//			}
//		}
//			BUT https://stackoverflow.com/questions/22267919/iterator-vs-for 
//			SO ...
		
		Iterator<Bus> it = buses.iterator();
		while (it.hasNext()) {
			if (it.next().getId() == id) {
				it.remove();
				return;
			}
		}
		
	}
}
