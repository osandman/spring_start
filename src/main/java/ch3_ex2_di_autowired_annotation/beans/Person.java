package ch3_ex2_di_autowired_annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
//    @Autowired // Field injection is not recommended
    private Parrot parrot;

    public Person() {
    }

    @Autowired  // after Spring 4.3 may not specify if only one constructor
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", parrot=" + parrot +
               '}';
    }
}
