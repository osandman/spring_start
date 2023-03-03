package ch2_ex3_register_bean.main;

public class Parrot {
    private String name;

    public Parrot() {
        System.out.println(this.getClass().getSimpleName() + " constructor started");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
