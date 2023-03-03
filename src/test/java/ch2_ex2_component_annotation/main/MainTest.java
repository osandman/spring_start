package ch2_ex2_component_annotation.main;

import ch2_ex2_component_annotation.config.ProjectConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
class MainTest {
    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Parrot instance added to the Spring context " +
                 "with the @Component annotation")
    public void parrotIsInTheSpringContextTest() {
        Parrot parrot = context.getBean(Parrot.class);
        parrot.setName("Koko");
        assertEquals("Koko", parrot.getName());
    }

    @Test
    @DisplayName("Test that a Parrot instance added to the Spring context " +
                 "by bean name")
    public void parrotIsInTheSpringContextByNameTest() {
        Parrot parrot = context.getBean("parrot_bean", Parrot.class);
        parrot.setName("Koko");
        assertEquals("Koko", parrot.getName());
    }
}