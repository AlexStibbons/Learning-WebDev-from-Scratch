package vp.spring.SpringDataJPACountry.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import vp.spring.SpringDataJPACountry.model.Place;

@Component
public interface PlaceRepository extends JpaRepository<Place, Long>{
	
	//public List<Place> findByPopulation(int population);
	public List<Place> findByNameContains(String name);
	//public List<Place> findByPopulationGreaterThanOrderByPopulationAsc(int population);

}
