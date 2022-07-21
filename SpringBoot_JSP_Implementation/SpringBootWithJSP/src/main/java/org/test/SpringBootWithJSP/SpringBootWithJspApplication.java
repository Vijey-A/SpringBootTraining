package org.test.SpringBootWithJSP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.test.SpringBootWithJSP")
public class SpringBootWithJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJspApplication.class, args);
	}

}
