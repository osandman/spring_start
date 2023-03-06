package ch3_ex1_dependency_injection_bean_annotation.main;

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
