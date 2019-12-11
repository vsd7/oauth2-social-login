/**
 * 
 */
package com.vd.oauth2sociallogin.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vd.oauth2sociallogin.models.User;

/**
 * @author Vivek Deshmukh
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);
}
