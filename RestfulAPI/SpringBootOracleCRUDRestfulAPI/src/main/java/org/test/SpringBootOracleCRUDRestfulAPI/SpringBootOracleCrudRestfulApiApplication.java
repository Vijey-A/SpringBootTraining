package org.test.SpringBootOracleCRUDRestfulAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootOracleCrudRestfulApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOracleCrudRestfulApiApplication.class, args);
	}

}

