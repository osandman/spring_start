package ch3_ex1_di_bean_annotation_qualifier.main;

import ch3_ex1_di_bean_annotation_qualifier.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        Parrot parrotBlue = context.getBean("parrotBlue", Parrot.class);

        Person person1 = context.getBean("person1_bean", Person.class);
        Person person2 = context.getBean("person2_bean", Person.class);
        Person person3 = context.getBean("person3_bean", Person.class);

        System.out.println(parrot);
        System.out.println(parrotBlue);
        System.out.println(person1.getName());
        System.out.println(person1.getParrot());
        System.out.println(person2.getName());
        System.out.println(person2.getParrot());
        System.out.println(person3.getName());
        System.out.println(person3.getParrot());
    }
}
