package vp04.pantic.test3.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vp04.pantic.test3.App.model.Item;
import vp04.pantic.test3.App.repository.ItemRepository;

@Component
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public Item save(Item item) {
		return itemRepository.save(item);
	}
	
	public void delete(Item item) {
		itemRepository.delete(item);
	}
	
	public void deleteById(long id) {
		itemRepository.deleteById(id);
	}
	
	public List<Item> findAll() {
		return itemRepository.findAll();
	}
	
	public Item findById(long id) {
		return itemRepository.findById(id).get();
	}
	
	public List<Item> findByNameContains(String name) {
		return itemRepository.findByNameContains(name);
	}
}
