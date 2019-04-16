package vp04.pantic.test3.App.web.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vp04.pantic.test3.App.service.LicitationService;
import vp04.pantic.test3.App.web.dto.LicitationDTO;

@RestController
public class LicitationController {

	@Autowired
	LicitationService licitationService;
	
	@GetMapping("api/licitations")
	public ResponseEntity<List<LicitationDTO>> findByJmbg(@RequestParam String jmbg) {
		
		List<LicitationDTO> dto = licitationService.findByJmbg(jmbg).stream()
									.map(LicitationDTO::new)
									.collect(Collectors.toList());
		
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@GetMapping("api/licitations/all")
	public ResponseEntity<List<LicitationDTO>> findAll() {
		
		List<LicitationDTO> dto = licitationService.findAll().stream()
									.map(LicitationDTO::new)
									.collect(Collectors.toList());
		
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	
	
}
