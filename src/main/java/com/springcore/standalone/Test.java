/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dell
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("standalone_config.xml");
        ApplicationContext con1 = new ClassPathXmlApplicationContext("tikki_standalone_config.xml");
        Student student1 = con.getBean("person1", Student.class);
        Tikki tikki = con1.getBean("tikki", Tikki.class);
        System.out.println(student1);
        System.out.println(tikki);
    }
}
