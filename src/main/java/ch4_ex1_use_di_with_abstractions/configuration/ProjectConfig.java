package ch4_ex1_use_di_with_abstractions.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"ch4_ex1_use_di_with_abstractions"})
@PropertySource("classpath:app.properties.properties")
public class ProjectConfig {

}
