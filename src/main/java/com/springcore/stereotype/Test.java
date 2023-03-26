/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dell
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("stereotype_config.xml");
        Person person = con.getBean("person", Person.class);
        System.out.println(person);
    }
}
