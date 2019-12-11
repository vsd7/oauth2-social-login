/**
 * 
 */
package com.vd.oauth2sociallogin.payload;

/**
 * @author Vivek Deshmukh
 *
 */
public class ApiResponse {

	private boolean success;
	private String message;

	public ApiResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}


}
