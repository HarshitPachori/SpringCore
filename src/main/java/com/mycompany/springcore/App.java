package com.mycompany.springcore;

import com.mycompany.springcore.collections.Emp;
import com.mycompany.springcore.ref.Person;
import com.springcore.cinject.A;
import com.springcore.cinject.Addition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext col_context = new ClassPathXmlApplicationContext("collection_config.xml");
        ApplicationContext ref_context = new ClassPathXmlApplicationContext("ref_config.xml");
        ApplicationContext cinject_context = new ClassPathXmlApplicationContext("cinject_config.xml");
        Student student1 = (Student) context.getBean("student1");
        Emp emp1 = (Emp) col_context.getBean("emp1");
        Person person = (Person) ref_context.getBean("person");
        A a = (A) cinject_context.getBean("a1");
        Addition addition = (Addition)cinject_context.getBean("add");
        System.out.println(student1);
        System.out.println(emp1);
        System.out.println(person.getCity());
        System.out.println(a);
        System.out.println(addition);

    }
}
