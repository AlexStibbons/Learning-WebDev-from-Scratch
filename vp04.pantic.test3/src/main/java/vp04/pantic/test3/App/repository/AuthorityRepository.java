package vp04.pantic.test3.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vp04.pantic.test3.App.model.user.SecurityAuthority;

public interface AuthorityRepository extends JpaRepository<SecurityAuthority, Long> {
	SecurityAuthority findByName(String name);
}
