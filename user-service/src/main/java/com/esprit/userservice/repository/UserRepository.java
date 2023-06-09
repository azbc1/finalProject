package com.esprit.userservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.userservice.model.User;

/**
 * User Repository
 * 
 * @author SayedBaladoh
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findBySiteId(Long siteId);

	List<User> findByOrganizationId(Long organizationId);
	
    Optional<User> findByUsername(String username);
}
