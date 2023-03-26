/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author dell
 */
public class Emp {

    // autowiring using annotation at attributes
    // when there is more than one bean of same type then spring container confuses so we use qualifier annotaion to give the bean name to this autowiring to create obj at runtime
    @Autowired
    @Qualifier("address1")
    private Address address;

    public Address getAddress() {
        return address;
    }
    // autowiring using annotation at properties / setter
//    @Autowired

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("setting address");
    }

    public Emp() {
        super();
    }
    // autowiring using annotation at constructor
//    @Autowired

    public Emp(Address address) {
        super();
        this.address = address;
        System.out.println("autowiring using constructor");
    }

    @Override
    public String toString() {
        return "Emp {" + "address=" + address + '}';
    }

}
