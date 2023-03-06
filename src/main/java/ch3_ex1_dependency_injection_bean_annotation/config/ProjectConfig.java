package ch3_ex1_dependency_injection_bean_annotation.config;

import ch3_ex1_dependency_injection_bean_annotation.main.Parrot;
import ch3_ex1_dependency_injection_bean_annotation.main.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    // DI with method parameter
    @Bean(name = {"person1_bean"})
    public Person person1(Parrot parrot) { // <-
        Person person = new Person();
        person.setName("Laura");
        person.setParrot(parrot);
        person.getParrot().setName("Jako");
        return person;
    }
    // DI with setter parameter
    @Bean(name = {"person2_bean"})
    public Person person2() {
        Person person = new Person();
        person.setName("Philipp");
        person.setParrot(parrot()); // <-
        person.getParrot().setName("Taura");
        return person;
    }

}
