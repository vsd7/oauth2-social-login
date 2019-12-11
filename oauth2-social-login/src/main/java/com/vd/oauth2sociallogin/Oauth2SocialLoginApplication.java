package com.vd.oauth2sociallogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.vd.oauth2sociallogin.configuration.AppConfig;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class Oauth2SocialLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2SocialLoginApplication.class, args);
	}

}
