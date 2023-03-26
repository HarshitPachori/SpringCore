/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.auto.wire;

/**
 *
 * @author dell
 */
public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("setting address");
    }

    public Emp() {
        super();
    }

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
