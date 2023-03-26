/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */

@Component
public class Person {
    @Value("Harshit Pachori")
    private String name;
    @Value("Aligarh")
    private String city;

    @Override
    public String toString() {
        return "Person {" + " name = " + name + ", city = " + city + " }";
    }
    
}
