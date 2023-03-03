package ch2_ex1_bean_annotation.main;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void init() {
        System.out.println("init method processing ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method processing ...");
    }
}
