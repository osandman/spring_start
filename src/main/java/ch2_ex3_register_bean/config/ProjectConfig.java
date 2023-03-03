package ch2_ex3_register_bean.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    public ProjectConfig() {
        System.out.println(this.getClass().getName() + " constructor started");
    }
}
