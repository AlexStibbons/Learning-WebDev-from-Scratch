package MavenBus.Bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import MavenBus.Bus.model.Bus;
import MavenBus.Bus.repository.BusRepo;

@Component
public class BusService {
	
	@Autowired
	BusRepo busRepo;
	
	public List<Bus> allBuses() {
		return busRepo.allBuses();
	}
	
	public List<Bus> findByLine(String line){
		return busRepo.findByLine(line);
	}
	
	public Bus findById(int id){
		return busRepo.findById(id);
	}
	
	public List<Bus> findByDestination(String destination){
		return busRepo.findByDestination(destination);
	}
	
	public Bus saveBus(Bus bus) {
		return busRepo.saveBus(bus);
	}
	
	public void deleteBus(int id) {
		busRepo.deleteBus(id);
	}

}
