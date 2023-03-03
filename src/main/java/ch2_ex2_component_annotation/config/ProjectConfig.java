package ch2_ex2_component_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ch2_ex2_component_annotation.main")
public class ProjectConfig {

}
