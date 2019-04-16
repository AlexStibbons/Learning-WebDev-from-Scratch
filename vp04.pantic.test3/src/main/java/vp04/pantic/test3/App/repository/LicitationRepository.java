package vp04.pantic.test3.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import vp04.pantic.test3.App.model.Licitation;

@Component
public interface LicitationRepository extends JpaRepository<Licitation, Long>{

}
