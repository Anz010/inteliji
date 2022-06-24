package com.syntax.class21;

import java.sql.SQLOutput;

public class HW1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
     */
    void method(int num1) {
        int area = num1 * num1;
        System.out.println("The area of square is " + area);}
    void method(int num1, int num2) {
        int area = num1 * num2;
        System.out.println("The area of rectangle with length " + num1 + " and width " + num2 + " is equal to " + area);
    }
    void method(int num1, int num2, int num3) {
        int area = num1 + num2+num3;
        System.out.println("The area of box with length " + num1 + " and width " + num2 + " and height " + num3+" is equal to "+area);
    }
}
class Test extends HW1 {
    public static void main(String[] args) {
        HW1 md = new HW1();
        md.method(3);
    }
}



