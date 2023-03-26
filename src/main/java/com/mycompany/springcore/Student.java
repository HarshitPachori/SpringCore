/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springcore;

/**
 *
 * @author dell
 */
public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;

    // constructor
    public Student(int studentId, String studentName, String studentAddress) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    // to string method
    @Override
    public String toString() {
        return "Student {" + "studentId = " + studentId + ", studentName = " + studentName + ", studentAddress = " + studentAddress + '}';
    }

    // getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("setting stud id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

}
