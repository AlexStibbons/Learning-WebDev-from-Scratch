package vp04.pantic.test3.App.service.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import vp04.pantic.test3.App.model.Item;
import vp04.pantic.test3.App.repository.ItemRepository;
import vp04.pantic.test3.App.service.ItemService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemServiceIntegrationTest {
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ItemRepository itemRepository;
	
	@After
	public void delete() {
		List<Item> toDel = itemService.findByNameContains("item name");
		
		toDel.stream()
			.forEach(toD -> itemService.delete(toD));
	}
	

	@Test
	public void addItem() {
		
		Item newItem = itemService.save(new Item(0L, "item name", 23, 40, false));

		assertEquals("item name", newItem.getName());
		
	}

}
