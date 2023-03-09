package ch3_ex2_di_autowired_annotation.main;

import ch3_ex2_di_autowired_annotation.beans.Parrot;
import ch3_ex2_di_autowired_annotation.beans.Person;
import ch3_ex2_di_autowired_annotation.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        parrot.setName("Gosha");
        System.out.println(parrot);
        Person person = context.getBean(Person.class);
        person.setName("Maria");
        System.out.println(person);
    }
}
