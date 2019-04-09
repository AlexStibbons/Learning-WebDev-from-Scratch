package vp04.pantic.test3.App.controller.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import vp04.pantic.test3.App.service.ItemService;
import vp04.pantic.test3.App.web.dto.AddLicitationDTO;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemControllerIntegrationTest {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	ItemService itemService;
	
	@Test
	public void licitation() {
		
		AddLicitationDTO dto = new AddLicitationDTO(20, 3);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(dto);
		
		ResponseEntity<String> response = restTemplate.exchange("/api/items/licitation", HttpMethod.PUT, httpEntity, String.class);
		
		String f = response.getBody();
		
		assertEquals("Licitation successful", f);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		
	}

}
