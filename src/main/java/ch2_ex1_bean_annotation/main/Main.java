package ch2_ex1_bean_annotation.main;


import ch2_ex1_bean_annotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("another_name", Parrot.class);
        Parrot p1 = context.getBean(Parrot.class);
        System.out.println(p.getName());
        System.out.println(p1.getName());
        String str = (String) context.getBean("hello");
        int num = (int) context.getBean("ten");
        System.out.println(str + " " + num);
        context.close();
    }
}