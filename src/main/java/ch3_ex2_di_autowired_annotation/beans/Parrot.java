package ch3_ex2_di_autowired_annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Parrot create");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
               "name='" + name + '\'' +
               '}';
    }
}
