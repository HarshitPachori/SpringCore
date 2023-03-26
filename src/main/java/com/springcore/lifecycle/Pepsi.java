/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author dell
 */
public class Pepsi implements InitializingBean, DisposableBean {

    private double price;

    public Pepsi() {
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
        return "Pepsi{" + "price=" + price + '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside the init method of Pepsi");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside the destroy method of Pepsi");
    }

}
