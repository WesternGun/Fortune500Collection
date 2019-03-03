package io.westerngun.fortune500collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Fortune500collectionApplication implements CommandLineRunner {

    @Autowired
    private FortuneData fortuneData;

    public static void main(String[] args) {
        //SpringApplication.run(Fortune500collectionApplication.class, args);
        SpringApplication app = new SpringApplication(Fortune500collectionApplication.class);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(fortuneData);
        Main main = new Main();
        main.process();

    }
}
