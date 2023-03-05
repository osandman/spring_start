package ch0_ex1_xml_app_context;

public abstract class Pet implements Voice {
    private String name;
    private int age;

    public Pet(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract void say();

    @Override
    public String toString() {
        return "Pet{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
