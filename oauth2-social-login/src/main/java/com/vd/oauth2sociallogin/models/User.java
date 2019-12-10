/**
 * 
 */
package com.vd.oauth2sociallogin.models;

import java.security.AuthProvider;

import com.sun.istack.internal.NotNull;

/**
 * @author vivedesh
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

}
