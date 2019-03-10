package MavenBus.Bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		return new ResponseEntity<List<Bus>>(buses, HttpStatus.OK);
	}
	
	// GET buses by searching line name
	@GetMapping("api/buses/{line}")
	public ResponseEntity<List<Bus>> findByLine(@PathVariable String line) {
		
		List<Bus> found = busService.findByLine(line); 
				
		return new ResponseEntity<List<Bus>>(found, HttpStatus.OK);
	}
	
	// GET buses by searching destination name
	@GetMapping("api/buses/destination/{destination}") // without '/destination' it won't work --> because 2 String type searches so it doesn't know where to look?
	public ResponseEntity<List<Bus>> findByDestination(@PathVariable String destination) {
		
		List<Bus> found = busService.findByDestination(destination);
		
		return new ResponseEntity<List<Bus>>(found, HttpStatus.OK);
	}
	
	// GET buses by id
	@GetMapping("api/buses/id/{id}") // without '/id' won't work --> ?? mapping? pom? config? version discrepancy?
//	Postman:
//	"status": 500,
//    "error": "Internal Server Error",
//    "message": "Ambiguous handler methods mapped for HTTP path
	public ResponseEntity<Bus> findByID(@PathVariable int id) {
		Bus found = busService.findById(id);
		return new ResponseEntity<Bus>(found, HttpStatus.OK); // won't accept `ResponseEntity<>(found, HttpStatus.OK)`
	}
	
	// DELETE bus by id
	@DeleteMapping("api/buses/{id}")
	public ResponseEntity<Void> deleteBus(@PathVariable int id) { // redirect?

		Bus bus = busService.findById(id);
		
		if (bus != null) {
			busService.deleteBus(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	// PUT change bus
	
}
