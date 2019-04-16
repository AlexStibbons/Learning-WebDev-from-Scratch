package vp04.pantic.test3.App.service.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import vp04.pantic.test3.App.model.Licitation;
import vp04.pantic.test3.App.service.LicitationService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class LicitationServiceIntegrationTest {
	
	@Autowired
	LicitationService licitationService;
	
	
	@Test
	public void findByJmbg() {
		
		List<Licitation> found = licitationService.findByJmbg("12589517");
		
		assertEquals(3, found.size());
		assertEquals("fname 1", found.get(0).getFirstName());
		assertEquals("lname 1", found.get(0).getLastName());
		
	}

}
