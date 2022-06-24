package com.syntax.class21;

public class HW4 {
    private void meth(String name) {
        System.out.println("Hello");
    }

    private void meth(int a, double b) {
        System.out.println("Good morning");
    }

    private void meth(String name, int a, double b) {
        System.out.println("Have a good night");
    }

    public static void main(String[] args) {
        HW4 cs=new HW4();
        cs.meth("Test");
        cs.meth(5, 25.5);
        cs.meth("Test", 4, 23.3);

    }
}