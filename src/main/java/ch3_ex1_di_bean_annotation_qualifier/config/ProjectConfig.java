package ch3_ex1_di_bean_annotation_qualifier.config;

import ch3_ex1_di_bean_annotation_qualifier.main.Parrot;
import ch3_ex1_di_bean_annotation_qualifier.main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    @Primary
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrotBlue() {
        Parrot p = new Parrot();
        p.setName("Rrricki");
        return p;
    }

    @Bean(name = {"person1_bean"})
    public Person person1(Parrot parrot) { // <- DI with method parameter
        Person person = new Person();
        person.setName("Laura");
        person.setParrot(parrot);
        person.getParrot().setName("Jako");
        return person;
    }

    @Bean(name = {"person2_bean"})
    public Person person2() {
        Person person = new Person();
        person.setName("Philipp");
        person.setParrot(parrot()); // <- DI with setter parameter
        person.getParrot().setName("Taura");
        return person;
    }

    @Bean(name = {"person3_bean"})
    public Person person3(
            @Qualifier("parrotBlue") Parrot parrot) {
        Person person = new Person();
        person.setName("John");
        person.setParrot(parrot);
        return person;
    }

}
