package vp.spring.JpaCountry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vp.spring.JpaCountry.model.Place;
import vp.spring.JpaCountry.service.PlaceService;

@RestController
public class PlaceController {

	@Autowired 
	PlaceService placeService;
	
	@RequestMapping(value = "api/places", method = RequestMethod.GET)
	public ResponseEntity<List<Place>> getAllPlaces() {
		
		List<Place> places = placeService.getAllPlaces();
		
		return new ResponseEntity<>(places, HttpStatus.OK);
	}
	
	@RequestMapping(value = "api/places/{id}", method = RequestMethod.GET)
	public ResponseEntity<Place> findPlaceById(@PathVariable Long id) {
		
		Place found = placeService.findPlaceById(id);
		
		if (found != null) {
			return new ResponseEntity<>(found, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("api/places")
	public ResponseEntity<Place> createPlace(@RequestBody Place place) {
		
		place.setId(null);
		
		Place created = placeService.savePlace(place);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	/*@PostMapping("api/places/update/{placeId}")
	public ResponseEntity<Place> changePlace(@PathVariable Long placeId) {
		Place toChange = placeService.findPlaceById(id);
		
		
	}*/
	
	
	@GetMapping("api/countries/{countryId}/places")
	public ResponseEntity<List<Place>> placesInState(@PathVariable Long countryId) {
		
		List<Place> found = placeService.placesInState(countryId);
		
		return new ResponseEntity<>(found, HttpStatus.OK);
	}
	
	
	
}
