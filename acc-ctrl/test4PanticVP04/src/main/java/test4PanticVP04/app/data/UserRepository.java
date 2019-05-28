package test4PanticVP04.app.data;

import org.springframework.data.jpa.repository.JpaRepository;

import test4PanticVP04.app.model.user.SecurityUser;

public interface UserRepository extends JpaRepository<SecurityUser, Long> {
	  public SecurityUser findByUsername(String username);
}
