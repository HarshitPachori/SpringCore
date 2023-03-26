/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.lifecycle;

/**
 *
 * @author dell
 */
public class Samosa {

    private double price;

    public Samosa() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" + "price=" + price + '}';
    }

    // lifecycle methods using xml files from beans
    public void init() {
        System.out.println("inside the init method of samosa");
    }

    public void destroy() {
        System.out.println("inside the destroy method of samosa");

    }
}
