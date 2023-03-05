package ch0_ex1_xml_app_context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
/*        Pet cat = new Cat("Murka");
        Person person = new Person(cat);
        System.out.println(person.pet.getName());
        person.pet.say();*/

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person iam = context.getBean("me", Person.class);
        System.out.println(iam);
/*
        Pet myCat = context.getBean("myPet", Pet.class);
        System.out.println(myCat.getName());
*/

    }

}
