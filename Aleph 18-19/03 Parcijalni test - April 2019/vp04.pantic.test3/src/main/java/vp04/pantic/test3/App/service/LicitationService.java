package vp04.pantic.test3.App.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vp04.pantic.test3.App.model.Licitation;
import vp04.pantic.test3.App.repository.LicitationRepository;

@Component
public class LicitationService {
	
	@Autowired
	LicitationRepository licitationRepository;
	
	public Licitation save(Licitation licitation) {
		return licitationRepository.save(licitation);
	}
	
	public void delete(Licitation licitation) {
		licitationRepository.delete(licitation);
	}
	
	public void deleteById(long id) {
		licitationRepository.deleteById(id);
	}
	
	public List<Licitation> findAll() {
		return licitationRepository.findAll();
	}
	
	public Licitation findById(long id) {
		return licitationRepository.findById(id).get();
	}
	
	public List<Licitation> findByJmbg(String jmbg) {
		
		List<Licitation> found = licitationRepository.findAll().stream()
								.filter(l -> l.getJmbg().equalsIgnoreCase(jmbg))
								.collect(Collectors.toList());
		
		return found;
		
	}

}
