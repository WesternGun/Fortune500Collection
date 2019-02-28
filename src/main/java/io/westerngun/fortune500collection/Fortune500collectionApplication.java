package io.westerngun.fortune500collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Fortune500collectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fortune500collectionApplication.class, args);
		Main main = new Main();
		main.process();
	}

}
