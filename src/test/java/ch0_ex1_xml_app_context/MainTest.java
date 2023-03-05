package ch0_ex1_xml_app_context;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
class MainTest {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Person instance " +
                 "has been added to the Spring context use xml configuration")
    public void personAddTest() {
        Person person = context.getBean("me", Person.class);
        assertNotNull(person);
        assertEquals("Oleg", person.getName());
        assertEquals("Barsik", person.getPet().getName());
    }


}