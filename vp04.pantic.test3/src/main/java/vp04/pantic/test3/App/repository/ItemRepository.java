package vp04.pantic.test3.App.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import vp04.pantic.test3.App.model.Item;

@Component
public interface ItemRepository extends JpaRepository<Item, Long>{
	
	public List<Item> findByNameContains(String name);

}
