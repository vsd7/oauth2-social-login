/**
 * 
 */
package com.vd.oauth2sociallogin.exceptions;

import org.springframework.security.core.AuthenticationException;

/**
 * @author Vivek Deshmukh
 *
 */
public class OAuth2AuthenticationProcessingException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3453031503519049170L;

	public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
		super(msg, t);
	}

	public OAuth2AuthenticationProcessingException(String msg) {
		super(msg);
	}
}
