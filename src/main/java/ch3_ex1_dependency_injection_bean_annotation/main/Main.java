package ch3_ex1_dependency_injection_bean_annotation.main;

import ch3_ex1_dependency_injection_bean_annotation.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        Person person1 = context.getBean("person1_bean", Person.class);
        Person person2 = context.getBean("person2_bean", Person.class);

        System.out.println(parrot);
        System.out.println(person1.getName());
        System.out.println(person1.getParrot());
        System.out.println(person2.getName());
        System.out.println(person2.getParrot());
    }
}
