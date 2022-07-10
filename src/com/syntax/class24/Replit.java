package com.syntax.class24;

class Main {
    public static void main(String[] args) {
        Employee cd=new Employee();
        cd.display("Joe","Smith",35,35000);
        Student1 cd2=new Student1();
        cd2.display("Adam","Smith",15,10);
        Retiree cd3=new Retiree();
        cd3.display("Frank","Smith",15,"tour");
    }
}

   class Person {
    String name;
    String lastName;
    int age;

    }
    class Employee extends Person {
        int salary;
            void display(String name, String lastName, int age,int salary){
               this.name=name;
               this.lastName=lastName;
               this.age=age;
                System.out.println(name+" "+lastName+" "+age+" "+salary);
            }
        }



    class Student1 extends Employee {
int grade;

        void display(String name, String lastName, int age,int grade){
            this.name=name;
            this.lastName=lastName;
            this.age=age;
            System.out.println(name+" "+lastName+" "+age+" "+grade);
        }
    }
    class Retiree extends Student1{
    String seniorActivity;

        void display(String name, String lastName,int age, String seniorActivity){
            this.name=name;
            this.lastName=lastName;
            this.age=age;
            System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
        }
    }

