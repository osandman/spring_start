package ch2_ex2_component_annotation.main;

import ch2_ex2_component_annotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        p.setName("Koko");
        System.out.println(p.getName());
        context.close();
    }
}