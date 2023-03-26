/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author dell
 */
public class Example {

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
        super();
    }

    @Override
    public String toString() {
        return "Example{" + "subject=" + subject + '}';
    }

    @PostConstruct
    public void start() {
        System.out.println("Starting method");
    }
    @PreDestroy
    public void end() {
        System.out.println("Ending method");
    }
}
