/**
 * 
 */
package com.vd.oauth2sociallogin.configuration;

/**
 * @author vivedesh
 *
 */
public class WebMvcConfig implements WebMvcConfigurer{
	
	private final long MAX_AGE_SECS = 3600;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
        .allowedHeaders("*")
        .allowCredentials(true)
        .maxAge(MAX_AGE_SECS);
    }

}
