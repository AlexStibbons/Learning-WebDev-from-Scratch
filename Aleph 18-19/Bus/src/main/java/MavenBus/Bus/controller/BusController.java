package MavenBus.Bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import MavenBus.Bus.model.Bus;
import MavenBus.Bus.service.BusService;

@RestController
public class BusController {

	@Autowired
	BusService busService;
	
	// GET all buses
	@GetMapping("api/buses")
	public ResponseEntity<List<Bus>> allBuses(){
		List<Bus> buses = busService.allBuses();
		return new ResponseEntity<>(buses, HttpStatus.OK);
	}
	
	// GET buses by searching line name
	@GetMapping("api/buses/{line}")
	public ResponseEntity<List<Bus>> findByLine(@PathVariable String line) {
		
		
		List<Bus> found = busService.findByLine(line); 
				
		return new ResponseEntity<>(found, HttpStatus.OK);
	}
	
	// GET buses by searching destination name
	@GetMapping("api/buses/destination/{destination}") 
	public ResponseEntity<List<Bus>> findByDestination(@PathVariable String destination) {
		
		List<Bus> found = busService.findByDestination(destination);
		
		return new ResponseEntity<>(found, HttpStatus.OK);
	}
	
	// GET buses by id
	@GetMapping("api/buses/id/{id}")
	public ResponseEntity<Bus> findByID(@PathVariable int id) {
		Bus found = busService.findById(id);
		return new ResponseEntity<>(found, HttpStatus.OK); 
	}
	
	// DELETE bus by id
	@DeleteMapping("api/buses/{id}")
	public ResponseEntity<Void> deleteBus(@PathVariable int id) { // redirect?

		Bus bus = busService.findById(id);
		
		if (bus != null) {
			busService.deleteBus(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// PUT change bus
	/*@PutMapping("api/buses/change/{id}") //, consumes = MediaType.APPLICATION_JSON_VALUE
	public ResponseEntity<Bus> changeBus(@PathVariable int id, 
			@RequestBody Bus bus) {
		
		bus.setId(id);
		
		Bus cBus = busService.saveBus(bus);
		
		return new ResponseEntity<>(cBus, HttpStatus.OK);
	}*/
	
	@RequestMapping(value = "api/buses/change/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bus> update(@PathVariable int id,
			@RequestBody Bus bus) {
		
		bus.setId(id); 

		Bus retVal = busService.saveBus(bus);

		return new ResponseEntity<>(retVal, HttpStatus.OK);
	} 
	
	
	// POST add bus
}
