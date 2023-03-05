package ch0_ex1_xml_app_context;

import org.springframework.stereotype.Component;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
