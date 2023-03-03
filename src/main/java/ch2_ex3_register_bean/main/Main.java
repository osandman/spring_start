package ch2_ex3_register_bean.main;

import ch2_ex3_register_bean.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot1 = new Parrot();
        parrot1.setName("Kiki");
        Parrot parrot2 = new Parrot();
        parrot2.setName("Luna");
        Supplier<Parrot> parrotSupplier = () -> parrot1;
        context.registerBean("parrot1", Parrot.class, parrotSupplier,
                beanDefinition -> beanDefinition.setPrimary(true));
        Parrot parrot3 = context.getBean(Parrot.class);
        System.out.println("parrot3 main: " + parrot3.getName());

    }
}
