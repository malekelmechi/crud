package tn.supcom.projetstage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy

public class ProjetstageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetstageApplication.class, args);
    }

}
