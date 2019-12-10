package com.vd.oauth2sociallogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class Oauth2SocialLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2SocialLoginApplication.class, args);
	}

}
