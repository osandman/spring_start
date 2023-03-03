package ch2_ex1_bean_annotation.config;

import ch2_ex1_bean_annotation.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean(name = {"koko", "another_name"})
    @Primary
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "miki")
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean(name = "parrot_bean", initMethod = "init", destroyMethod = "destroy")
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Riki");
        return p;
    }

    @Bean
    String hello() {
        return "Hello!";
    }

    @Bean
    int ten() {
        return 10;
    }
}
