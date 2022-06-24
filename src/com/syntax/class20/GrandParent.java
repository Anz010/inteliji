package com.syntax.class20;

import java.sql.SQLOutput;

public class GrandParent {
    String name="Murad";
}
class Parent extends GrandParent{
    void printInfo(){
        System.out.println("Name of my father is: "+name);
    }
}
class Child1 extends Parent{
    void printInfo(){
        System.out.println("Name of my grandpa is:"+name);
    }
}
class GrandChild extends Child1{
    void printInfo(){
        System.out.println("My grand grand fathets name is: "+name);
    }

    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();
        grandChild.printInfo();
        Child1 child1=new Child1();
        child1.printInfo();
    }
}