package com.abnamro.dkw.recipes;

import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RecipesRestapiApplication {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(RecipesRestapiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RecipesRestapiApplication.class, args);
		
		LOGGER.info("RecipesRestapiApplication");
	}

}
