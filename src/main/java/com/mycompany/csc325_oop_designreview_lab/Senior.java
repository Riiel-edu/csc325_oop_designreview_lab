package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    private String name;
    private String address;
    private short age;
    private double gpa;
    private int credits;

    // constructor that takes only two paras
    public Senior(String name, short age, int credits) {
        super(name, age);
        this.name = name;
        this.age = age;
        if(credits >= 85) {
            this.credits = credits;
        } else {
            this.credits = 85;
            System.out.println("A senior must have a minimum of 85 credits");
        }
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

    public double getGPA() {
        return this.gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if(credits >= 85) {
            this.credits = credits;
        } else {
            System.out.println("A senior must have a minimum of 85 credits");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nGPA: " + gpa + "\nCredits:  " + credits + "\nGrade Level: Senior\n";
    }
}
