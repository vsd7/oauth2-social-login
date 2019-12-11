/**
 * 
 */
package com.vd.oauth2sociallogin.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author Vivek Deshmukh
 *
 */
public class LoginRequest {

	@NotBlank
	@Email
	private String email;

	@NotBlank
	private String password;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


}
