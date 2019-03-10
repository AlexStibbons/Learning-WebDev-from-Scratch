package MavenBus.Bus.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import MavenBus.Bus.model.Bus;
import MavenBus.Bus.model.Departure;

@Component("departureRepo")
public class DepartureRepo {

	@Autowired
	BusRepo busRepo;
	
	private List<Departure> departures = new ArrayList<Departure>();
	
	public DepartureRepo(BusRepo busRepo) {
		
		departures.add(new Departure(1, "1am"));
		departures.get(0).getBuses().add(busRepo.findById(1));
		departures.get(0).getBuses().add(busRepo.findById(2));
				
		departures.add(new Departure(2, "2am"));
		departures.get(0).getBuses().add(busRepo.findById(2));
		departures.get(0).getBuses().add(busRepo.findById(3));
		departures.get(0).getBuses().add(busRepo.findById(1));
		
		departures.add(new Departure(3, "3am"));
		departures.get(0).getBuses().add(busRepo.findById(4));
		departures.get(0).getBuses().add(busRepo.findById(5));
		departures.get(0).getBuses().add(busRepo.findById(1));
		
		departures.add(new Departure(4, "4am"));
		departures.get(0).getBuses().add(busRepo.findById(3));
		departures.get(0).getBuses().add(busRepo.findById(5));
		
		departures.add(new Departure(5, "5am"));
		departures.get(0).getBuses().add(busRepo.findById(4));
		
		departures.add(new Departure(6, "6am"));
		
		departures.add(new Departure(7, "7am"));
		departures.get(0).getBuses().add(busRepo.findById(1));
		departures.get(0).getBuses().add(busRepo.findById(2));
		departures.get(0).getBuses().add(busRepo.findById(3));
		departures.get(0).getBuses().add(busRepo.findById(4));
		departures.get(0).getBuses().add(busRepo.findById(5));
		
	}
	
	public List<Departure> findByBus(Bus bus) {
		List<Departure> found = new ArrayList<Departure>();
		
		for (Departure departure : departures) {
			for (Bus dBus : departure.getBuses()) {
				if (bus.getId() == dBus.getId()) {
					found.add(departure);
				}
			}
		}
		return found;
	}
	
	
}
