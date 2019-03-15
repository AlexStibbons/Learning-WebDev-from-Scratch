package vp.spring.JpaCountry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vp.spring.JpaCountry.data.PlaceRepository;
import vp.spring.JpaCountry.model.Place;

@Component
public class PlaceService {

	@Autowired
	PlaceRepository placeRepository;
	
	public List<Place> getAllPlaces() {
		return placeRepository.getAllPlaces();
	}
	
	public Place findPlaceById(Long id) {
		return placeRepository.findPlaceById(id);
	}
	
	public Place savePlace(Place place) {
		return placeRepository.savePlace(place);
	}
	
	public List<Place> placesInState(Long countryId) {
		return placeRepository.placesInState(countryId);
	}
	
}
