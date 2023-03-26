/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dell
 */
public class Emp {

    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;

    public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
        super();
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
    }

    public Emp() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Emp{" + "name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + '}';
    }

}
