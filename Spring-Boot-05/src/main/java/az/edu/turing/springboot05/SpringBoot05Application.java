package az.edu.turing.springboot05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBoot05Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot05Application.class, args);
    }
}
