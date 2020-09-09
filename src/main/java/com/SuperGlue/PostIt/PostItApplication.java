package com.SuperGlue.PostIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application entrypoint
 * @author Daniel Dornhof
 *
 */
@SpringBootApplication
public class PostItApplication {

	/**
	 * Starts the application using Sping Boot
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PostItApplication.class, args);
	}

}
