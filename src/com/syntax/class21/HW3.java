package com.syntax.class21;

public class HW3 {
//Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

    static void meth(String name){
        System.out.println("Hello");
    }
    static void meth(int a, double b ){
        System.out.println("Good morning");
    }
    static void meth(String name,int a, double b ){
        System.out.println("Have a good night");
    }

    public static void main(String[] args) {
        meth("Test");
        meth(5,25.5);
        meth("Test",4,23.3);
    }
}
