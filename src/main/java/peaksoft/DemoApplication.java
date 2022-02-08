package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson1", Person.class);
        Person person2 = context.getBean("myPerson2", Person.class);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(person);
        person.getAnimal().animalPlus();
        person.getAnimal().animalMinus();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(person2);
        person2.getAnimal().animalPlus();
        person2.getAnimal().animalMinus();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        context.close();

    }
}
