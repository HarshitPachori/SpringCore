/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.standalone;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */
@Component
public class Tikki {
    @Value("Harshit Pachori")
    private String name;
    
    // spring expression language #{temp\
    @Value("#{temp}")
    private List<String> flavour;

    @Override
    public String toString() {
        return "Tikki { " + "name = " + name + ", flavour = " + flavour + '}';
    }
    
}
