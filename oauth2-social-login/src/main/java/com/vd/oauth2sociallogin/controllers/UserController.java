/**
 * 
 */
package com.vd.oauth2sociallogin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vd.oauth2sociallogin.exceptions.ResourceNotFoundException;
import com.vd.oauth2sociallogin.models.User;
import com.vd.oauth2sociallogin.repositories.UserRepository;
import com.vd.oauth2sociallogin.security.CurrentUser;
import com.vd.oauth2sociallogin.security.UserPrincipal;

/**
 * @author Vivek Deshmukh
 *
 */
@RestController
public class UserController {

	@Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
	
}
