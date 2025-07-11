/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human
    private String name;
    private String address;
    private short age;
    private double gpa;

    public Student(String name, short age) {
        super(name, age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter

	public double getGPA() {
        return this.gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

	// ToDo 4: Add comments to your code

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nGPA: " + gpa + "\n";
    }
}
