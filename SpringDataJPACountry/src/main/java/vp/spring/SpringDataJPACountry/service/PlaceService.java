package vp.spring.SpringDataJPACountry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import vp.spring.SpringDataJPACountry.data.PlaceRepository;
import vp.spring.SpringDataJPACountry.model.Place;

@Component
public class PlaceService {
	
	@Autowired
	PlaceRepository placeRepository;
	
	public List<Place> findAll() {
		return placeRepository.findAll();
	}
	
	// Pageable!
	public Page<Place> findAll(Pageable page) {
		return placeRepository.findAll(page);
	}
	
	public Place findOne(Long id) {
		return placeRepository.findById(id).get(); // has Optional!
	}
	
	public List<Place> findByNameContains(String name) {
		return placeRepository.findByNameContains(name);
	}
	
//	public List<Place> findByPopulation(int population) {
//		return placeRepository.findByPopulation(population);
//	}
	
//	public List<Place> findByPopulationGreaterThanOrderByPopulationAsc(int population) {
//		return placeRepository.findByPopulationGreaterThanOrderByPopulationAsc(population);
//	}
	
	public Place save(Place place) {
		return placeRepository.save(place);
	}
	
	public void remove(Long id) {
		placeRepository.deleteById(id);
	}

}
