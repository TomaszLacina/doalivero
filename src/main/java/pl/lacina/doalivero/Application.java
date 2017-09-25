package pl.lacina.doalivero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//
//    @Bean
//    DbPopulator populator(){
//        return new DbPopulator();
//    }

}
