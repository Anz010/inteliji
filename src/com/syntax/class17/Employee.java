package com.syntax.class17;

public class Employee {
    public String name;
    private int salary;
    String department;

    private void printSalary(){
        System.out.println("Salary "+salary);
    }
void printDepartment(){
    System.out.println("Department "+department);
}
public void printName(){
    System.out.println(name);
}

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="Jason";

        employee.department="It Destroyer";
        employee.salary=150000;
        employee.printName();
        employee.printDepartment();
        employee.printSalary();

        Employee employee1=new Employee();
        employee1.name="Anzor";
        employee1.printName();
    }
}
