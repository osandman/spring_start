package ch2_ex1_bean_annotation.main;

import ch2_ex1_bean_annotation.config.ProjectConfig;
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
    @DisplayName("Test that a Parrot1 instance added to the Spring context with " +
                 "annotation @Primary")
    public void parrotIsInTheSpringContextTest() {
        Parrot p = context.getBean(Parrot.class);
        assertEquals("Koko", p.getName());
    }

    @Test
    @DisplayName("Test the Parrot instance named parrot2 has the main 'Miki'")
    public void parrot2HasTheNameMikiTest() {
        Parrot p = context.getBean("miki", Parrot.class);
        assertEquals("Miki", p.getName());
    }
    @Test
    @DisplayName("Test that a string object added to the Spring context")
    public void stringIsInTheSpringContextTest() {
        String str = context.getBean(String.class);
        assertEquals("Hello!", str);
    }

    @Test
    @DisplayName("Test that an int value added to the Spring context")
    public void intIsInTheSpringContextTest() {
        int num = context.getBean(int.class);
        assertEquals(10, num);
    }

}