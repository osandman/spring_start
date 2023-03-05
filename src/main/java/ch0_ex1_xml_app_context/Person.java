package ch0_ex1_xml_app_context;

public class Person {
    private String name;
    private int age;
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public String getName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", pet=" + pet +
               '}';
    }
}
