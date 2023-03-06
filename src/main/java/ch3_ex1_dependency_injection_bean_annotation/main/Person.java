package ch3_ex1_dependency_injection_bean_annotation.main;

public class Person {
    private String name;
    private Parrot parrot;

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
