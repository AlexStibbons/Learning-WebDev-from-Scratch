package test4PanticVP04.app.data;

import org.springframework.data.jpa.repository.JpaRepository;

import test4PanticVP04.app.model.user.SecurityAuthority;

public interface AuthorityRepository extends JpaRepository<SecurityAuthority, Long> {
	SecurityAuthority findByName(String name);
}
