package ch2_ex2_component_annotation.main;

import org.springframework.stereotype.Component;

@Component("parrot_bean")
public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("created Parrot instance");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
