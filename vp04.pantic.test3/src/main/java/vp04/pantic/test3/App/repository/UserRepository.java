package vp04.pantic.test3.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vp04.pantic.test3.App.model.user.SecurityUser;

public interface UserRepository extends JpaRepository<SecurityUser, Long> {
	  public SecurityUser findByUsername(String username);
}
