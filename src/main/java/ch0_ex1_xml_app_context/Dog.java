package ch0_ex1_xml_app_context;

import org.springframework.stereotype.Component;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Woof-woof");
    }
}
