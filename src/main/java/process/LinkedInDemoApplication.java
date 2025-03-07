package process;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "model")
@ComponentScan(basePackages = "model")
@EnableJpaRepositories(basePackages = "repository")
@ComponentScan(basePackages = {"process", "controller", "service", "repository", "model"})
public class LinkedInDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkedInDemoApplication.class, args);
        System.out.println("Springboot Application Started");
    }

}
