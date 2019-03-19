package vp.spring.SpringDataJPACountry.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vp.spring.SpringDataJPACountry.model.Country;
import vp.spring.SpringDataJPACountry.model.Place;
import vp.spring.SpringDataJPACountry.service.CountryService;
import vp.spring.SpringDataJPACountry.service.PlaceService;
import vp.spring.SpringDataJPACountry.web.dto.CountryDTO;
import vp.spring.SpringDataJPACountry.web.dto.PlaceDTO;

@RestController
public class PlaceController {
	
	@Autowired
	PlaceService placeService;
	
	@Autowired
	CountryService countryService;
	
	@GetMapping("api/places")
	public ResponseEntity<Page<PlaceDTO>> findAllPlacesPage(Pageable page) {
		
		// a page of real places, not dto yet
		Page<Place> places = placeService.findAll(page);
		
		// do a header so ppl know where they are
		
		
		//to return data to client, convert to dto --> converting is not supported, it's made
		List<PlaceDTO> returnDTOs = convertPlacesToDTOs(places.getContent());
		
		Page<PlaceDTO> dtoPage = new PageImpl<>(returnDTOs, page, places.getTotalElements());
		
		return new ResponseEntity<>(dtoPage, HttpStatus.OK);
		
	}
	
	private List<PlaceDTO> convertPlacesToDTOs(List<Place> places) {
		
		List<PlaceDTO> placesDTOs = new ArrayList<>();
		
		for (Place place : places) {
			
			PlaceDTO placeDTO = new PlaceDTO(place); // each time there is a place, make a new DTO
			placeDTO.setCountry(new CountryDTO(place.getCountry())); // placeDTO receives NOT a country, but a CountryDTO --> this is easily made via CountryDTO constructor!
			
			placesDTOs.add(placeDTO);
		}
		
		return placesDTOs;
		
	}
	
	@PostMapping("api/places")
	public ResponseEntity<PlaceDTO> addPlace(@RequestBody PlaceDTO placeDTO) {
		

		Place addedPlace = new Place();
		
		//addedPlace.setId(placeDTO.getId()); --> gets id automatically
		addedPlace.setName(placeDTO.getName());
		addedPlace.setZipCode(placeDTO.getZipCode());
		//addedPlace.setCountry(placeDTO.getCountry());
		
		addedPlace = placeService.save(addedPlace);

		return new ResponseEntity<>(new PlaceDTO(addedPlace), HttpStatus.CREATED);
	}
	
	

}
