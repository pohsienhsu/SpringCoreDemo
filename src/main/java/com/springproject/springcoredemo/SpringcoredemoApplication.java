package com.springproject.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication(
		scanBasePackages = {"com.springproject.springcoredemo",
							"com.springproject.util"}
)
 */
@SpringBootApplication
public class SpringcoredemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
