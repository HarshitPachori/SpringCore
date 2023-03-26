/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.cinject;

/**
 *
 * @author dell
 */
public class Addition {

    private int x;
    private int y;

    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructor int : int");
    }

    public Addition(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
        System.out.println("Constructor double : double");
    }

    @Override
    public String toString() {
        return "Addition{" + "x=" + x + ", y=" + y + '}';
    }

}
