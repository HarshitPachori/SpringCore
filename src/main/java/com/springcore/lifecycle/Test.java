/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dell
 */
public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        // for registering the shutdown hook used for the calling of destroy method
        context.registerShutdownHook();
        Samosa samosa = (Samosa) context.getBean("s1");
        Pepsi pepsi = (Pepsi) context.getBean("p1");
        System.out.println(samosa);
        System.out.println("******************************************************************************************");
        System.out.println(pepsi);
        System.out.println("******************************************************************************************");
        Example ex =(Example) context.getBean("example");
        System.out.println(ex);
    }
}
