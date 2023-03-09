package ch3_ex2_di_autowired_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ch3_ex2_di_autowired_annotation.beans")
public class ProjectConfig {


}
