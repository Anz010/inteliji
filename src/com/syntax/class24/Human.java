package com.syntax.class24;

public class Human {


    String name;
    int age;
    double weight;
    String color;


    public Human(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

}
class Employee1 extends Human{
    String employeeID;
    double salary;
    String title;
    String department;



    public Employee1(String name, int age, double weight, String color, String employeeID, double salary, String title, String department) {
        super(name, age, weight, color);
        this.employeeID = employeeID;
        this.salary = salary;
        this.title = title;
        this.department = department;
    }
    @Override
    public String toString() {
        return "Employee1{" +
                "employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

}
class SDET extends Employee{
    String programmingLanguage;
    String framework;
    boolean knowSelenium;

}
