package vp.spring.JpaCountry.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vp.spring.JpaCountry.model.Country;
import vp.spring.JpaCountry.model.Place;

@Component
@Transactional
public class PlaceRepository {

	@PersistenceContext
	EntityManager em;
	
	@Autowired
	CountryRepository countryRepository;
	
	public List<Place> getAllPlaces() {
		Query q = em.createQuery("SELECT p FROM Place p");
		
		return q.getResultList();
	}
	
	
	public Place findPlaceById(Long id) {
		return em.find(Place.class, id);
	}
	
	public Place savePlace(Place place) {
		
		if (place.getId() != null) {
			return em.merge(place);
		} else {
			em.persist(place);
			return place;
		}
	}
	
	public List<Place> placesInState(Long countryId) {
		
		//Country country = countryRepository.findOne(countryId);
		
		//Query q = em.createQuery("SELECT p.name FROM Place p LEFT JOIN p.country c WHERE p.country = :countryId");
		// SELECT place.name FROM Places LEFT JOIN country ON place.country_id = country.id WHERE place.country_id = country.id;
				// SELECT place.name FROM place WHERE country_id = 3; -- no join
		
		Query q = em.createQuery("SELECT p.name FROM Place p WHERE p.country.id = :countryId");
		q.setParameter("countryId", countryId); // SET parameter!!
		
		List<Place> found = q.getResultList();
		
		return found;
		
	}
	
}
