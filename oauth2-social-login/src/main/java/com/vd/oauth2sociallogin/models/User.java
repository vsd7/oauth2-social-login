package com.vd.oauth2sociallogin.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Vivek Deshmukh
 *
 */
@Entity
@Table(name = "users", uniqueConstraints = {
		@UniqueConstraint(columnNames = "email")
})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Email
	@Column(nullable = false)
	private String email;

	private String imageUrl;

	@Column(nullable = false)
	private Boolean emailVerified = false;

	@JsonIgnore
	private String password;

	@NotNull
	@Enumerated(EnumType.STRING)
	private AuthProvider provider;

	private String providerId;

	/**
	 * @return the id
	 */
	 public Long getId() {
		 return id;
	 }

	 /**
	  * @param id the id to set
	  */
	 public void setId(Long id) {
		 this.id = id;
	 }

	 /**
	  * @return the name
	  */
	 public String getName() {
		 return name;
	 }

	 /**
	  * @param name the name to set
	  */
	 public void setName(String name) {
		 this.name = name;
	 }

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
	  * @return the imageUrl
	  */
	 public String getImageUrl() {
		 return imageUrl;
	 }

	 /**
	  * @param imageUrl the imageUrl to set
	  */
	 public void setImageUrl(String imageUrl) {
		 this.imageUrl = imageUrl;
	 }

	 /**
	  * @return the emailVerified
	  */
	 public Boolean getEmailVerified() {
		 return emailVerified;
	 }

	 /**
	  * @param emailVerified the emailVerified to set
	  */
	 public void setEmailVerified(Boolean emailVerified) {
		 this.emailVerified = emailVerified;
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

	 /**
	  * @return the provider
	  */
	 public AuthProvider getProvider() {
		 return provider;
	 }

	 /**
	  * @param provider the provider to set
	  */
	 public void setProvider(AuthProvider provider) {
		 this.provider = provider;
	 }

	 /**
	  * @return the providerId
	  */
	 public String getProviderId() {
		 return providerId;
	 }

	 /**
	  * @param providerId the providerId to set
	  */
	 public void setProviderId(String providerId) {
		 this.providerId = providerId;
	 }



}
