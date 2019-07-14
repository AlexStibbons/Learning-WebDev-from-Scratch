package vp04.pantic.test3.App.web.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vp04.pantic.test3.App.model.Item;
import vp04.pantic.test3.App.model.Licitation;
import vp04.pantic.test3.App.service.ItemService;
import vp04.pantic.test3.App.service.LicitationService;
import vp04.pantic.test3.App.web.dto.AddItemDTO;
import vp04.pantic.test3.App.web.dto.AddLicitationDTO;
import vp04.pantic.test3.App.web.dto.ItemDTO;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@Autowired
	LicitationService licitationService;
	
	@GetMapping("api/items")
	public ResponseEntity<List<ItemDTO>> findAll() {
		
		List<ItemDTO> dto = itemService.findAll().stream()
							.map(ItemDTO::new)
							.collect(Collectors.toList());
		
		return new ResponseEntity<>(dto, HttpStatus.OK);
		
	}
	
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_USER')")
	@PostMapping("api/items/new")
	public ResponseEntity<ItemDTO> addItem(@RequestBody AddItemDTO addItem){
		
		Item newItem = new Item();
		newItem.setName(addItem.getName());;
		newItem.setLicitationPrice(addItem.getLicitationPrice());
		newItem.setSalePrice(addItem.getSalePrice());
		newItem.setSold(false);
		newItem = itemService.save(newItem);
		
		ItemDTO dto = new ItemDTO(newItem);
		
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@PutMapping("api/items/licitation")
	public ResponseEntity<String> addLicitation(@RequestBody AddLicitationDTO licitation) {
		
		// find the item
		Item toBuy = itemService.findById(licitation.getItemId());
		
		// save the licitation
		Licitation newLicitation = new Licitation();
		newLicitation.setItem(toBuy);
		newLicitation.setOffer(licitation.getOffer());
		newLicitation = licitationService.save(newLicitation);
		
		// what to do with the item		
		if (toBuy == null) {
			return new ResponseEntity<>("Item not found", HttpStatus.NOT_FOUND);
		}
		
		if (toBuy.isSold()) {
			
			return new ResponseEntity<>("Item sold.", HttpStatus.NOT_FOUND); 
			
		} else if (toBuy.getSalePrice() < licitation.getOffer()) {
			
			toBuy.setSold(true);
			toBuy = itemService.save(toBuy);
			
			return new ResponseEntity<>("You got the item", HttpStatus.OK); 
			
		} else  {
			
			if (toBuy.getLicitationPrice() <= licitation.getOffer()) {
				return new ResponseEntity<>("Licitation successful", HttpStatus.OK);} 
		};			
		
		return new ResponseEntity<>("Offer is smaller than minimum", HttpStatus.OK);
	}
	
}

